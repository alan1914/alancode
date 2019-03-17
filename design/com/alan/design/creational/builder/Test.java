package com.alan.design.creational.builder;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/29/029 16:59
 **/
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式PPT",
                "Java设计模式视频",
                "Java设计模式手记",
                "Java设计模式QA");

        System.out.println(course);

    }

}
