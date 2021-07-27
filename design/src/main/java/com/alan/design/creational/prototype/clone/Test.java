package com.alan.design.creational.prototype.clone;

import java.util.Date;

/**
 * @author stone
 * @des TODO
 * @date 2019/1/3/003 17:20
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }

}
