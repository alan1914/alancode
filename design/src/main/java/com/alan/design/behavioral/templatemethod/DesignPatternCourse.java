package com.alan.design.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    /**
     * 该课程需要 写手记
     * @return true
     */
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
