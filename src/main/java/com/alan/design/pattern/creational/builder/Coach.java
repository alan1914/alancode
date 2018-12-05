package com.alan.design.pattern.creational.builder;

/**
 * @author stone
 * @des TODO
 * @date 2018/11/29/029 16:53
 **/
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courserQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courserQA);

        return this.courseBuilder.makeCourse();
    }

}
