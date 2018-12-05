package com.alan.effectivejava.chapter6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author stone
 * @des 内存泄露示例
 * @date 2018/12/5/005 8:40
 **/
public class Stack {

    private Object[] element;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {

    }

    public void push(Object e) {
        ensureCapacity();
        element[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // 注意下面这行代码会引起内存泄露
        // 如果一个栈是先增长，然后再收缩，那么，从栈中弹出来的对象将不会被当做垃圾回收，即使使用栈的程序不再引用这些对象，他们也不会被回收
        // 栈内部维护着这些对象的过期引用。过期引用：永远也不会再被解除的引用。
        // 本例中 凡是element数组中的活动部分之外的任何引用都是过期的。活动部分：element中下标小于size的那些元素
        // return element[--size];

        Object result = element[--size];
        // 解决方法如下 消除过期引用
        // Eliminate obsolete reference
        element[size] = null;
        return result;


    }

    /**
     * ensure space for at least one more element,roughly
     * doubling the capacity each time the array needs to grow
     */
    private void ensureCapacity() {
        if (element.length == size) {
            element = Arrays.copyOf(element, 2 * size + 1);
        }
    }
}
