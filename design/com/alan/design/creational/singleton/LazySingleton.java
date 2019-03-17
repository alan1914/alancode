package com.alan.design.creational.singleton;

/**
 * @author stone
 * @des 懒汉式单例
 * @date 2018/12/3/003 11:16
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
