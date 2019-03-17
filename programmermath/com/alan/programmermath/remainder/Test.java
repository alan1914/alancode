package com.alan.programmermath.remainder;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/12/012 9:19
 **/
public class Test {

    private static final int MAX = 590127;
    private static final int MULTIPLE = 7;

    /**
     * 加密算法
     * @param num 待加密值
     * @return
     */
    public static int encryptionNum(int num) {
        System.out.println("加密前：" + num);
        // 1.取余 并 加上随机数
        int bit = num % 10;
        int tenBit = num % 100 / 10;
        int hundredBit = num % 1000 / 100;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        bit = bit + MAX;
        tenBit = tenBit + MAX;
        hundredBit = hundredBit + MAX;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        // 2.每个位数 除以7 取余代替原来的个十百
        bit = bit % MULTIPLE;
        tenBit = tenBit % MULTIPLE;
        hundredBit = hundredBit % MULTIPLE;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        // 3.swap 第一位和第三位
        int temp;
        temp = bit;
        bit = hundredBit;
        hundredBit = temp;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        int result = bit + tenBit * 10 + hundredBit * 100;
        System.out.println("加密结果为：" + result);
        return result;
    }

    /**
     * 解密算法
     * @param num 待解密值
     * @return
     */
    public static int decryptNum(int num) {
        System.out.println("解密前：" + num);
        // 1.取余
        int bit = num % 10;
        int tenBit = num % 100 / 10;
        int hundredBit = num % 1000 / 100;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        // 2.交互位数
        int temp;
        temp = bit;
        bit = hundredBit;
        hundredBit = temp;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        // 3.乘回7的倍数
        // 这里可能有bug 只能针对当前的MAX值 如果换了一个随机值 要考虑 是否要+1
        int temp2 = (MAX / MULTIPLE) + 1;
        bit = bit + temp2 * MULTIPLE;
        tenBit = tenBit + temp2 * MULTIPLE;
        hundredBit = hundredBit + temp2 * MULTIPLE;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        // 4.减去随机数
        bit = bit - MAX;
        tenBit = tenBit - MAX;
        hundredBit = hundredBit - MAX;
        System.out.println(bit + "\t" + tenBit + "\t" + hundredBit);
        int result = bit + tenBit * 10 + hundredBit * 100;
        System.out.println("解密结果为：" + result);
        return result;
    }

    public static void main(String[] args) {
        int originalNum = 625;
        int encryptionNmu = encryptionNum(originalNum);
        System.out.println();
        decryptNum(encryptionNmu);
    }
}
