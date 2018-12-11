package com.alan.programmermath.binarysystem;

import java.math.BigInteger;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/11/011 10:39
 **/
public class Lesson1_1 {

    /**
     * 10 进制 转 2进制
     * @param decimalSource
     * @return
     */
    public static String decimalToBinary(int decimalSource){
        // 转换成 BigInteger类型 ，默认是十进制
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        // 参数2值的是 转换为2进制
        return bi.toString(2);
    }

    /**
     * 2进制 转 10进制
     * @param binarySource
     * @return
     */
    public static int binaryToDecimal(String binarySource){

        BigInteger bi = new BigInteger(binarySource,2);
        return Integer.parseInt(bi.toString());
    }

    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        // 获取十进制数 53 的二进制数
        System.out.println(String.format(" 数字 %d 的二进制是 %s", a, Lesson1_1.decimalToBinary(a)));
        // 获取二进制数 110101 的十进制数
        System.out.println(String.format(" 数字 %s 的十进制是 %d", b, Lesson1_1.binaryToDecimal(b)));
    }
}
