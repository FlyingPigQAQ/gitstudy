>背景：
之前使用kill -9 pid的方式停止应用，该操作比较粗暴。
通过使用kill -15 pid 或者通过curl -i post ip:port/actuator/shutdown
/actuator/shutdown默认为禁用状态

## 配置Http Mapping
```yaml
management:
  endpoint:
    shutdown:
      enabled: true
  endpoints:
    web:
      exposure:
        include:  health,info,shutdown
```

- GracefulShutdown  

```java    

/**
 *s生产环境使用"kill -15 pid"来优雅的停止应用服务器
 */
@Log4j2
public class GracefulShutdown implements TomcatConnectorCustomizer, ApplicationListener<ContextClosedEvent> {
    private static final long TIMEOUT = 30 ;
    private volatile Connector connector;

    @Override
    public void customize(Connector connector) {
        this.connector = connector;
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        this.connector.pause();


        Executor executor = this.connector.getProtocolHandler().getExecutor();

        if(executor instanceof ThreadPoolExecutor){
            try{
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
                threadPoolExecutor.shutdown();
                if (!threadPoolExecutor.awaitTermination(TIMEOUT, TimeUnit.SECONDS)) {
                    log.warn("Tomcat thread pool did not shut down gracefully within "
                            + TIMEOUT + " seconds. Proceeding with forceful shutdown");

                    threadPoolExecutor.shutdownNow();

                    if (!threadPoolExecutor.awaitTermination(TIMEOUT, TimeUnit.SECONDS)) {
                        log.error("Tomcat thread pool did not terminate");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        log.info("Application has been shutdown gracefully");


    }
}

```

- ShutdownConfig  

```java  

@Configuration
public class ShutdownConfig {

    @Bean
    public GracefulShutdown gracefulShutdown() {
        return new GracefulShutdown();
    }

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(final GracefulShutdown gracefulShutdown) {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(gracefulShutdown);
        return factory;
    }
}

```
