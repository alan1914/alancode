package com.alan.leetcode.search;

/**
 * @author stone
 * @des 二分查找
 * @date 2019/2/22/022 11:12
 **/
public class BinarySearch {

    public boolean isInArray(int[] intArr, int searchNum) {
        int length = intArr.length;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (searchNum < intArr[mid]) {
                right = mid - 1;
            } else if (searchNum > intArr[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 3, 6, 10, 15};
        int searchNum = 8;
        BinarySearch binarySearch = new BinarySearch();
        boolean bool = binarySearch.isInArray(intArr, searchNum);
        System.out.println(bool);
    }


}
