package com.alan.design.creational.factorymethod;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 8:21
 **/
public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
