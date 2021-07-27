package com.alan.javabase.thread;

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("thread 1");
        MyThread myThread2 = new MyThread("thread 2");
        MyThread myThread3 = new MyThread("thread 3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
