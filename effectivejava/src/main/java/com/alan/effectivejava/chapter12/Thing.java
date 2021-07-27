package com.alan.effectivejava.chapter12;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/10/010 16:51
 **/
public class Thing {

    String name;
    String content;

    public Thing(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
