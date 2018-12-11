package com.alan.effectivejava.chapter6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author stone
 * @des 内存泄露示例
 * @date 2018/12/5/005 8:40
 **/
public class Stack implements Cloneable{

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
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

        Object result = elements[--size];
        // 解决方法如下 消除过期引用
        // Eliminate obsolete reference
        elements[size] = null;
        return result;


    }

    /**
     * ensure space for at least one more element,roughly
     * doubling the capacity each time the array needs to grow
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("11");
        System.out.println("克隆前：" + stack);
        Stack cloneStack = stack.clone();
        System.out.println("克隆后：" + cloneStack);
        stack.pop();
        System.out.println("原始值：" + stack);
        System.out.println("克隆值：" + cloneStack);
    }


}
