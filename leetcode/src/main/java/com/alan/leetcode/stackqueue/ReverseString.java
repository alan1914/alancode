package com.alan.leetcode.stackqueue;

import java.util.Stack;

/**
 * 翻转字符串
 *
 * @author shiml
 * @date 2020/2/18 10:00 AM
 */
public class ReverseString {

    public static void reverseString(char[] s) {
        Stack stack = new Stack();
        for (char item : s) {
            stack.push(item);
        }

        char[] output = new char[s.length];
        for (int i = 0; i < s.length; i++) {
//            output.
        }

        System.out.println(stack.pop());
    }

    public static void main(String[] args) {
//        String str = "hello";
//        ReverseString.reverseString(str.toCharArray());

        String redirectUri = "http://smartum.sz.gov.cn/zhzf/zfsq/oauth/authorize?client_id=szcg-attendance&redirect_uri=https://smartum.sz.gov.cn/zhzf/wsqw/login&response_type=code&state=SPPTW1";

        String http  = redirectUri.substring(0,redirectUri.indexOf(":"));

        System.out.println(http);

    }

}
