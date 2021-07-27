package com.alan.javabase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/6/006 13:36
 **/
public class BRReadLines {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("enter lines of text");
        System.out.println("enter 'end' to quit");
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }

}
