package com.alan.design.creational.factorymethod;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 8:20
 **/
public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
