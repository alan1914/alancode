package com.alan.design.behavioral.templatemethod;

public abstract class ACourse {

    /**
     * 定义final 方法
     * 不希望子类修改 录制课程流程的顺序
     */
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
           this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    /**
     * 包装课程
     */
    abstract void packageCourse();
}
