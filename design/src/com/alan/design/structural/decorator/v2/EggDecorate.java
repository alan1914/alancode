package com.alan.design.structural.decorator.v2;

public class EggDecorate extends AbstractDecorator{


    public EggDecorate(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDest() {
        return super.getDest() + " 加个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
