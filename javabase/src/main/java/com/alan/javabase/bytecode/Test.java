package com.alan.javabase.bytecode;

public class Test {

    public static void main(String[] args) {
        String name = "Alan";
        String hard = new String("Alan");
        System.out.println(name == hard);
        System.out.println(name.equals(hard));

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }


}
