package com.alan.design.structural.composite;

public class Test {

    public static void main(String[] args) {
        // 添加一级课程
        CatalogCompoent linuxCourse = new Course("Linux 课程",11);
        CatalogCompoent windowCourse = new Course("Window 课程",22);

        // 添加java 二级菜单
        CatalogCompoent javaCourseCatalog = new CourseCatalog("Java 课程目录",2);

        // 添加java 二级课程
        CatalogCompoent mmallCourse1 = new Course("Java 电商一期",55);
        CatalogCompoent mmallCourse2 = new Course("Java 电商二期",66);
        CatalogCompoent designPattern = new Course("Java 设计模式",77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        // 添加一级 菜单
        CatalogCompoent imoocCatalog = new CourseCatalog("慕课网 课程总目录",1);
        imoocCatalog.add(linuxCourse);
        imoocCatalog.add(windowCourse);
        imoocCatalog.add(javaCourseCatalog);

        // 打印当前所有课程目录
        imoocCatalog.print();
    }

}
