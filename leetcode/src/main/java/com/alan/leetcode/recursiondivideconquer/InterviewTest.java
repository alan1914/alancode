package com.alan.leetcode.recursiondivideconquer;

public class InterviewTest {

    public static int test(int num){
        if(num == 1){
            return 1;
        }
        return (test(num-1) + num);
    }

    public static void main(String[] args) {
        System.out.println(test(100));
        System.out.println(14^23);
    }

}
