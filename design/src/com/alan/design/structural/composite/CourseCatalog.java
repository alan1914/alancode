package com.alan.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogCompoent {

    private List<CatalogCompoent> items = new ArrayList<>();

    String name;

    Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName(CatalogCompoent catalogCompoent) {
        return this.name;
    }

    @Override
    public void add(CatalogCompoent catalogCompoent) {
        items.add(catalogCompoent);
    }

    @Override
    public void remove(CatalogCompoent catalogCompoent) {
        items.remove(catalogCompoent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogCompoent item : items) {
            // 判断当前节点的层级属性是否为空
            if(this.level != null){
                // 根据目录所在 层级属性 打印相应缩进
                for (int i = 0; i <level ; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
