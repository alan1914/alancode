package com.alan.leetcode.stackqueue;

import java.util.Stack;

/**
 * 20 VaildParenttheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * 解题思路
 * 1.将字符串分解为 char 并遍历
 * 2. 对 '(' '[' '{' 三种入栈 入栈值为其另一半
 * 3. 如果 ')' '}' '}' 则出栈
 * 出栈前 判断 是否为空
 * 出栈后 判断 出栈的值是否等于当前比较值
 * 4.遍历结束后判断整个栈是否为空
 *
 * @author stone
 * @date 2019-04-06
 **/
public class ValidParentheses2 {

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();
        char temp;

        for (char item : chars) {
            if(item == '('){
                stack.push(')');
            }
            if(item == '['){
                stack.push(']');
            }
            if(item == '{'){
                stack.push('}');
            }
            if(item == ')' || item == ']' || item == '}'){
                if(stack.size() <= 0){
                    return false;
                }
                // 出栈
                temp = stack.pop();
                if(temp != item){
                    return false;
                }
            }
        }

        // 如果最后栈不为空 也失败
        if(stack.size() > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }

}
