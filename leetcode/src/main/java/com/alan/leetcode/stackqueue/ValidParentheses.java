package com.alan.leetcode.stackqueue;

import java.util.Stack;

/**
 * 题目 VaildParenttheses
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * 解题思路
 * 1.将字符串分解为 char 并遍历
 * 2. 对 '(' '[' '{' 三种入栈 入栈值为其另一半
 * 3. 如果 ')' '}' '}' 则出栈
 *          出栈前 判断 是否为空
 *          出栈后 判断 出栈的值是否等于当前比较值
 * 4.遍历结束后判断整个栈是否为空
 *
 * @author stone
 * @date 2019/1/10/010 13:16
 **/
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char item : s.toCharArray()){
            if(item == '('){
                stack.push(')');
            }else if(item == '['){
                stack.push(']');
            }else if(item == '{'){
                stack.push('}');
            }else{
                if(item == ')' || item == ']' || item == '}'){
                    // 栈为空 或者 出栈值不等于当前值 则返回错误
                    if(stack.isEmpty() || stack.pop() != item){
                        return false;
                    }
                }
            }
        }
        // 如果最后栈不为空 则返回错误
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

}
