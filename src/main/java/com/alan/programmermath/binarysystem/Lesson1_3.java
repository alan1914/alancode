package com.alan.programmermath.binarysystem;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/11/011 11:04
 **/
public class Lesson1_3 {

    /**
     * 二进制 或
     * @param num1
     * @param num2
     * @return
     */
    public static int or(int num1,int num2){
        return (num1 | num2);
    }

    /**
     * 二进制 与
     * @param num1
     * @param num2
     * @return
     */
    public static int and(int num1,int num2){
        return (num1 & num2);
    }

    /**
     * 二进制 异或
     * @param num1
     * @param num2
     * @return
     */
    public static int xor(int num1,int num2){
        return (num1 ^ num2);
    }

    public static void main(String[] args) {
        int a = 53;
        int b = 35;
        // 获取十进制数 53 和 35 的按位“或”
        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘或’结果是 %d(%s)",
                a, Lesson1_1.decimalToBinary(a), b, Lesson1_1.decimalToBinary(b), or(a, b), Lesson1_1.decimalToBinary(Lesson1_3.or(a, b))));
        // 获取十进制数 53 和 35 的按位“与”
        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘与’结果是 %d(%s)",
                a, Lesson1_1.decimalToBinary(a), b, Lesson1_1.decimalToBinary(b), and(a, b), Lesson1_1.decimalToBinary(Lesson1_3.and(a, b))));
        // 获取十进制数 53 和 35 的按位“异或”
        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘异或’结果是 %d(%s)",
                a, Lesson1_1.decimalToBinary(a), a, Lesson1_1.decimalToBinary(a), xor(a, a), Lesson1_1.decimalToBinary(Lesson1_3.xor(a, a))));
    }
}
