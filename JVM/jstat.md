## jstat详解
```
jstat -<option> [-t] [-h<lines>] <vmid> [<interval> [<count>]]
```
#### option参数
1. --statOptions   

class 统计加载class loader信息  
compiler 统计just-in-time JIT编译信息    
gc 统计垃圾回收信息  
gccapacity  统计各个时间段新生代、老年代使用空间情况和gc次数
gccause 统计垃圾回收信息和（gcutil相似），同时会打印最后一个和当前一个gc的原因  
gcnew 统计新生代信息  
gcnewcapacity 统计新生代极其空间使用情况    
gcold 统计老年代信息  
gcoldcapacity 统计老年代以及空间使用情况    
gcpermcapacity 统计永久代空间使用情况(hotspot 1.8以下)  
gcmetacapacity 统计元数据空间使用情况(Hotspot 1.8及以上)  
gcutil 统计垃圾回收情况    
printcompilation  统计方法编译情况  


#### -t 参数
打印时间戳
#### -h<lines>
lines为正整数，代表每lines个输出就显示一次列标题
#### vmid
进程pid
#### interval
间隔多长时间输出
#### count
一共打印多少次
> Examples  
>>jstat -gc 5988 2000 100
## 相关参考文档
[Hotspot8](https://docs.oracle.com/javase/8/docs/technotes/tools/)  
[Hotspot7](https://docs.oracle.com/javase/7/docs/technotes/tools/)
