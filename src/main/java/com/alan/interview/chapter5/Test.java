package com.alan.interview.chapter5;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/4/004 14:31
 **/
public class Test {

    public static void main(String[] args) {

        // 二进制定义
        int a = 017;
        // 注意 j = 078是错误的 因为这是八进制的 只能选0~7
        // int j = 078;
        System.out.println(a);

        int i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        // 相当于
        //        String s;
        //        if(i<40){
        //            s = "life";
        //        }else if (i>50)
        //        {
        //            s = "universe";
        //        }else{
        //            s = "everything";
        //        }
        System.out.println(s);

        int b = 5;
        System.out.println("value is " + ((a < 5) ? 10.9 : 9));


        char x = 'x';
        int c = 10;
        System.out.println(false ? c : x);
        System.out.println(false ? 10 : x);

    }

    // main方法 必须是 public
    // static void main(String[] args) {}




}
