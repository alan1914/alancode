package com.alan.design.pattern.creational.prototype.abstractprototype;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/3/003 17:17
 **/
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
