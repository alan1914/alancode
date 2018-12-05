package com.alan.design.pattern.creational.simplefactory;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/5/005 17:09
 **/
public class Test {

    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();

    }


}
