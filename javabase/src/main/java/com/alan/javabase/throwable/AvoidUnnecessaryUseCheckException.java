package com.alan.javabase.throwable;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

/**
 * 避免不必要的使用受检查异常
 */
public class AvoidUnnecessaryUseCheckException {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.get(2);
    }

}
