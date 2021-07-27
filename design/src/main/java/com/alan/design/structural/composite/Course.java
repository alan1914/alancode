package com.alan.design.structural.composite;

public class Course extends CatalogCompoent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogCompoent catalogCompoent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogCompoent catalogCompoent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + "，Price " + price);
    }
}
