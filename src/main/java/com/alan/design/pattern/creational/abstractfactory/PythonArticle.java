package com.alan.design.pattern.creational.abstractfactory;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 20:43
 **/
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Python手记");
    }
}
