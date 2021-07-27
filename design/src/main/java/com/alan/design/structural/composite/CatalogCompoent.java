package com.alan.design.structural.composite;

public abstract class CatalogCompoent {

    public void add(CatalogCompoent catalogCompoent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogCompoent catalogCompoent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogCompoent catalogCompoent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogCompoent catalogCompoent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
