package com.alan.leetcode.mapset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * 解法一
 * sort 根据Ascii码 排序 比较是否相等
 * time N*logN
 *
 * 解法二
 * Map 计数
 * time N*O(1)
 *
 * @author stone
 * @date 2019/1/11/011 14:39
 **/
public class ValidAnagram {

    public boolean isAnagram2(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = run(s);
        Map<Character, Integer> map2 = run(t);
        return map1.equals(map2);
    }

    public Map<Character, Integer> run(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char item : s.toCharArray()) {
            int tempCount = 0;
            if (map.get(item) != null) {
                tempCount = map.get(item);
            }
            map.put(item, tempCount + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        // hash
        boolean bool = validAnagram.isAnagram("anagram", "nagaram");
        System.out.println(bool);
        // sort
        boolean bool2 = validAnagram.isAnagram2("anagram", "nagaram");
        System.out.println(bool2);

    }

}
