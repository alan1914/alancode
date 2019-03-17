package com.alan.design.creational.factorymethod;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 8:24
 **/
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
