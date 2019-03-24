package com.alan.design.structural.decorator.adapter.classadapter;

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
