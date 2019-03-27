package com.alan.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("课程1");
        Course course2 = new Course("课程2");
        Course course3 = new Course("课程3");
        Course course4 = new Course("课程4");
        Course course5 = new Course("课程5");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);

        System.out.println("--- 课程列表 ---");
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("--- 删除后，课程列表 ---");
        printCourse(courseAggregate);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

       Iterator<String> iterator = arrayList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }

    private static void printCourse(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }

}
