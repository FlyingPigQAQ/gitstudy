## 读  

```java
byte[] bytes = allocateBytes(1024 * 64);
int offset = 0;
for (;;) {
    int readCount = is.read(bytes, offset, bytes.length - offset);
    if (readCount == -1) {
        break;
    }
    offset += readCount;
    if (offset == bytes.length) {
        byte[] newBytes = new byte[bytes.length * 3 / 2];
        System.arraycopy(bytes, 0, newBytes, 0, bytes.length);
        bytes = newBytes;
    }
}
```
