package com.alan.design.structural.adapter.objcetadpter;

public class Adapter implements Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
