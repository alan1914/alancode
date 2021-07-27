package com.alan.design.creational.singleton;


/**
 * @author stone
 * @des TODO
 * @date 2018/12/3/003 11:23
 **/
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName());
    }
}
