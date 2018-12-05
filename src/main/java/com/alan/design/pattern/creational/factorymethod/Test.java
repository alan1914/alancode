package com.alan.design.pattern.creational.factorymethod;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/5/005 17:09
 **/
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory1 = new JavaVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }


}
