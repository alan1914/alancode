package com.alan.leetcode.recursiondivideconquer;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * <p>
 * solution1:
 * 暴力 列举所有 输出合法
 * <p>
 * solution2:
 * recursion
 * time: 2^2n
 * <p>
 * solution3:
 * recursion 减枝
 * 判断不合法即返回 进行下一个
 * time: 2^n
 *
 * @author stone
 * @date 2019/1/23/023 15:50
 **/
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        char[] chars = new char[2 * n];
        generateAll(chars, 0, resultList);
        return resultList;
    }

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (isValid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public boolean isValid(char[] chars) {
        int temp = 0;
        for (char item : chars) {
            if (item == '(') {
                temp++;
            }else{
                temp--;
            }
            if (temp < 0) {
                return false;
            }
        }
        return temp == 0;
    }

    public static void main(String[] args) {
        int n = 3;
        GenerateParentheses obj = new GenerateParentheses();
        List<String> list = obj.generateParenthesis(n);
        System.out.println(list.toString());
    }

}
