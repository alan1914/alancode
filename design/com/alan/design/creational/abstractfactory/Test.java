package com.alan.design.creational.abstractfactory;

import java.io.UnsupportedEncodingException;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 20:47
 **/
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

//        String string = new String("\u767b\u5f55\u6210\u529f".getBytes(), "utf-8");
//        System.out.println(string);
    }

}
