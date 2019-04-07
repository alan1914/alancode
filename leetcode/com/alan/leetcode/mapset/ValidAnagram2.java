package com.alan.leetcode.mapset;

import java.util.Arrays;
import java.util.HashMap;

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
 * <p>
 * 解法二
 * Map 计数
 * time N*O(1)
 *
 * @author stone
 * @date 2019/1/11/011 14:39
 **/
public class ValidAnagram2 {

    /**
     * sort
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sNew = Arrays.toString(sArr);
        String tNew = Arrays.toString(tArr);
        return sNew.equals(tNew);
    }

    /**
     * HashMap
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        for (char c : sArr) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (char c : tArr) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }


        return map1.equals(map2);
    }

    public static void main(String[] args) {
        ValidAnagram2 validAnagram = new ValidAnagram2();
        // hash
        boolean bool = validAnagram.isAnagram("anagram", "nagaram");
        System.out.println(bool);
        // sort
        boolean bool2 = validAnagram.isAnagram2("cat", "tac");
        System.out.println(bool2);

    }

}
