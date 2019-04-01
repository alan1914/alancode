package com.alan.design.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("Alan");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("stone");
        question.setQuestionContent("Java 的反射是还是呢么");

        course.productQuestion(course, question);
    }

}
