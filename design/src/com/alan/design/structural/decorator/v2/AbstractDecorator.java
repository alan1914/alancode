package com.alan.design.structural.decorator.v2;

public class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected void doSometing(){};

    @Override
    protected String getDest() {
        return this.aBattercake.getDest();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
