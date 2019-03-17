package com.alan.design.creational.abstractfactory;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 20:39
 **/
public class JavaCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
