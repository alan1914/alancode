package com.alan.javabase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc = Class.forName("com.alan.javabase.reflect.Robbot");
        // 获取 对象
        Robbot robbot = (Robbot) rc.newInstance();
        System.out.println("Class name is" + robbot);

        // 获取私有方法
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str = getHello.invoke(robbot,"alan");
        System.out.println("getHello result is： " + str);

        // 获取公有方法
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(robbot,"welcome");

        // 获取私有对象
        Field field = rc.getDeclaredField("name");
        field.setAccessible(true);
        field.set(robbot,"alan");
        sayHi.invoke(robbot,"welcome");

        System.out.println(System.getProperty("java.ext.class"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
