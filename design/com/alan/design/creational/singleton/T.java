package com.alan.design.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/3/003 11:23
 **/
@Slf4j
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        log.info(Thread.currentThread().getName());
    }
}
