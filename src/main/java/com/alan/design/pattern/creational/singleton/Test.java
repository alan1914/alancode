package com.alan.design.pattern.creational.singleton;


import lombok.extern.slf4j.Slf4j;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/3/003 11:18
 **/
@Slf4j
public class Test {


    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();


        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        log.info("program end");

    }

}
