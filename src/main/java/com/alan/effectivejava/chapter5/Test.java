package com.alan.effectivejava.chapter5;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/4/004 17:25
 **/
public class Test {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("执行代码块/方法");
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
        System.out.println(sum);
    }

}
