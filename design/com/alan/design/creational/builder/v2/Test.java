package com.alan.design.creational.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/30/030 10:37
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {

//        Course course = coach.makeCourse("Java设计模式精讲",
//                "Java设计模式PPT",
//                "Java设计模式视频",
//                "Java设计模式手记",
//                "Java设计模式QA");

        Course course = new Course.CourseBuilder()
                .buildCoureseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式PPT")
                .buildCourseVideo("Java设计模式视频")
                .build();
        System.out.println(course);

        int i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        log.info(s);
    }

}
