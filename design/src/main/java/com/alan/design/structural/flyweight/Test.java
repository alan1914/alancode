package com.alan.design.structural.flyweight;

public class Test {

    private static final String departments[] = {"RD", "AQ", "PM", "BD"};

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            String department = departments[(int) (Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//        }

        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b);

        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d);
    }

}
