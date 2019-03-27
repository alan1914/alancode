package com.alan.javabase.thread;

public class CycleWait implements Runnable{

    private String value;

    @Override
    public void run(){

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {

        CycleWait cycleWait = new CycleWait();
        Thread thread = new Thread(cycleWait);
        thread.start();
//        while (cycleWait.value == null){
//            Thread.currentThread().sleep(100);
//        }
        // 程的合并的含义就是 将几个并行线程的线程合并为一个单线程执行，
        // 应用场景是 当一个线程必须等待另一个线程执行完毕才能执行时，
        // Thread类提供了join方法来完成这个功能，注意，它不是静态方法。
        thread.join();
        System.out.println("value:" + cycleWait.value);
    }

}
