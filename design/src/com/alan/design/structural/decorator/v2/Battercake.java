package com.alan.design.structural.decorator.v2;

public class Battercake extends ABattercake{

    @Override
    protected String getDest() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
