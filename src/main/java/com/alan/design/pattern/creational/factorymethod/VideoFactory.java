package com.alan.design.pattern.creational.factorymethod;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/5/005 17:10
 **/
public abstract class VideoFactory {

    public abstract Video getVideo();

//    public Video getVideo(Class c) {
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }


}
