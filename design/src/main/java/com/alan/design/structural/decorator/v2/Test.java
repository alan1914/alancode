package com.alan.design.structural.decorator.v2;

public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorate(aBattercake);
        aBattercake = new EggDecorate(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDest() + ",cost:" + aBattercake.cost());
    }
}

