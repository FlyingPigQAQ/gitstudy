package com.mmall.io;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    public static byte[] read(InputStream ins) throws IOException {
        byte[] bytes = new byte[1024*1];
        int offset =0;
        for (;;){
            int readCount= ins.read(bytes,offset,bytes.length-offset);
            if(readCount==-1){
                break;
            }
            offset+=readCount;
            if(offset==bytes.length){
                byte[] newBytes = new byte[bytes.length*3/2];
                System.arraycopy(bytes,0,newBytes,0,bytes.length);
                bytes=newBytes;
            }
        }
        return bytes;
    }

    public static void main(String[] args) {
        String path = "/Users/tobbyquinn/learning/gitstudy/c31mjn/" +
                "Concurrency/src/main/resources/pride-and-prejudice.txt";
        try {
            byte[] article = read(new FileInputStream(new File(path)));
            System.out.println(new String(article,"utf-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
