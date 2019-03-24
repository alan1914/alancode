package com.alan.design.structural.decorator.adapter.classadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarge();
        target.request();

        Target target1 = new Adapter();
        target1.request();

    }

}
