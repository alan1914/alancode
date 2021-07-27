package com.alan.programmermath.binarysystem;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/11/011 10:55
 **/
public class Lesson1_2 {

    /**
     * 向左位移
     * @param num 等待移位的十进制数
     * @param m 向左移的位数
     * @return int 移位后的十进制数
     */
    public static int leftShift(int num,int m){
        return num << m;
    }

    /**
     * 向右移位
     * @param num 等待移位的十进制数
     * @param m  向右移的位数
     * @return int 移位后的十进制数
     */
    public static int rightShift(int num,int m){
        return num >>> m;
    }

    public static void main(String[] args) {
        int num = 53;
        int m = 1;
        // 测试向左移位
        System.out.println(String.format(" 数字 %d 的二进制向左移 %d 位是 %d", num, m, Lesson1_2.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format(" 数字 %d 的二进制向右移 %d 位是 %d", num, m, Lesson1_2.rightShift(num, m)));

        System.out.println();

        m = 3;
        // 测试向左移位
        System.out.println(String.format(" 数字 %d 的二进制向左移 %d 位是 %d", num, m, Lesson1_2.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format(" 数字 %d 的二进制向右移 %d 位是 %d", num, m, Lesson1_2.rightShift(num, m)));

    }
}
