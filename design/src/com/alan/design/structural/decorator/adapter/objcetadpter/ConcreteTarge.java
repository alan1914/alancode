package com.alan.design.structural.decorator.adapter.objcetadpter;

public class ConcreteTarge implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}