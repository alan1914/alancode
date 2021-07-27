package com.alan.javabase.file;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author shiml
 * @date 2020/5/6 10:55 上午
 */
public class FileGBK2UTF {

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("/Users/alan1914/Downloads/shequ.sql");
        FileOutputStream fos = new FileOutputStream("/Users/alan1914/Downloads/shequ2.sql");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        byte[] buff = new byte[4096];
        while(fis.read(buff) !=-1){
            out.write(buff);
        }

        fos.write(out.toString("GBK").getBytes("UTF-8"));

        fis.close();
        out.close();
        fos.close();
    }

}
