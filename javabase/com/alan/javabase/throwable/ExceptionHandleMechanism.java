package com.alan.javabase.throwable;

public class ExceptionHandleMechanism {

    public static int doWork() {
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:" + e);
            return 0;
        } catch (Exception e) {
            System.out.println("Exception:" + e);
            return 1;
        } finally {
            System.out.println("Finally");
//            return 2;
        }

        return 2;
    }

    public static void main(String[] args) {
        System.out.println("执行后的值：" + doWork());
    }

}
