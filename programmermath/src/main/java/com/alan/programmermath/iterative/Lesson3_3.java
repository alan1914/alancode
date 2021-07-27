package com.alan.programmermath.iterative;

import java.util.Arrays;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/20/020 13:48
 **/
public class Lesson3_3 {

    /**
     * 查找某个单词是否在字典里出现
     *
     * @param dictionary 排序后的字典
     * @param wordToFind 待查的单词
     * @return boolean 是否发现待查的单词
     */
    public static boolean search(String[] dictionary, String wordToFind) {

        if (dictionary == null) {
            return false;
        }

        if (dictionary.length == 0) {
            return false;
        }

        int left = 0, right = dictionary.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (dictionary[middle].equals(wordToFind)) {
                return true;
            } else {
                // String.compareTo 按字典顺序比较两个字符串 该比较基于字符串中各个字符的 Unicode 值
                // 如果按字典顺序此 String 对象位于参数字符串之前，则比较结果为一个负整数;
                // 如果按字典顺序此 String 对象位于参数字符串之后，则比较结果为一个正整数;
                // 如果这两个字符串相等，则结果为 0
                if (dictionary[middle].compareTo(wordToFind) > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {

        String[] dictionary = {"i", "am", "one", "of", "the", "authors", "in", "geekbang"};

        Arrays.sort(dictionary);
        System.out.println(Arrays.toString(dictionary));

        String wordToFind = "int";

        boolean found = Lesson3_3.search(dictionary, wordToFind);
        if (found) {
            System.out.println(String.format(" 找到了单词 %s", wordToFind));
        } else {
            System.out.println(String.format(" 未能找到单词 %s", wordToFind));
        }

    }

}
