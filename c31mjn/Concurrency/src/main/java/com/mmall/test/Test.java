package com.mmall.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {

        int i =0x11;
        String str ="123";
        System.out.println(str);
        System.out.println(i);
        System.out.println(i);

        System.out.println(HttpCode.OK==HttpCode.ERROR);

        String tokenId= "AQIC5wM2LY4Sfcwg_ljJ6Ka3hARibBYo_hzz2LhzTH31Kxo.*AAJTSQACMDMAAlNLABM3OTQyNTU2MTYyNTI1OTIzNzEwAAJTMQACMDE.*";
        String encode = URLEncoder.encode(tokenId, "utf-8");
        System.out.println(encode);
    }

    enum HttpCode{
        OK(200,"成功"),
        ERROR(500,"失败");

        private Integer code;
        private String msg;

        private HttpCode(Integer code,String msg){
            this.code = code;
            this.msg = msg;
        }
    }
}
