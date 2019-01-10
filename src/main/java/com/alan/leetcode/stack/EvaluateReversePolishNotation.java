package com.alan.leetcode.stack;

import java.util.Stack;

/**
 * @author stone
 * @des 求逆波兰表示法
 * @date 2018/12/29/029 15:23
 **/
public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String str : tokens) {
            if ("-".equals(str) || "+".equals(str) || "*".equals(str) || "/".equals(str)) {
                int b = stack.pop();
                int a = stack.pop();

                stack.push(calculate(str, a, b));
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.elementAt(0);
    }

    public static int calculate(String opr, int a, int b) {
        int result = 0;
        switch (opr) {
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new RuntimeException();
                }
                result = a / b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evalRPN(tokens);

        System.out.println(result);


    }


}
