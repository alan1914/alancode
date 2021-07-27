package com.alan.javabase.reflect;

public class LoadDifference {

    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader classLoader = Robbot.class.getClassLoader();
//        Class r = Class.forName("com.alan.javabase.reflect.Robbot");
        Class.forName("com.mysql.jdbc.Driver");
    }
}
