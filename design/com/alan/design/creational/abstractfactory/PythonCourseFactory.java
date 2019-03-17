package com.alan.design.creational.abstractfactory;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/6/006 20:44
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
