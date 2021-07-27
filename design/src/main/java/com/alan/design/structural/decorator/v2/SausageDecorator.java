package com.alan.design.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator{


    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDest() {
        return super.getDest() + " 加个火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
