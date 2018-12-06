package com.alan.javabase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author stone
 * @des 从控制台读取多字符输入
 * @date 2018/12/6/006 13:32
 **/
public class BRRead {

    public static void main(String[] args) throws IOException {
        char c;
        // 使用System.in 创建 bufferReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下 'q' 退出");
        // 读取字符
        do{
            c = (char) bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }

}
