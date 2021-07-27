package com.alan.leetcode.sort;

import java.util.Arrays;

public class BubbleSort2 {

    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * time: O(n^2)
     *
     * @param intArr
     */
    public static int[] bubbleSort2(int[] intArr) {
        int[] result = Arrays.copyOf(intArr, intArr.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    /**
     * 快速排序
     * <p>
     * time:O（nLgn）
     *
     * @param intArr
     */
    public static int[] quickSort(int[] intArr) {
        int[] result = Arrays.copyOf(intArr, intArr.length);
        qsort(result, 0, result.length - 1);
        return result;
    }

    public static void qsort(int[] arr, int l, int r) {
        // 判断是否越界
        if (l > r) {
            return;
        }
        int key = arr[l], i = l, j = r;
        while (i < j) {
            while (i < j && arr[j] >= key) j--;
            arr[i] = arr[j];
            while (i < j && arr[i] <= key) i++;
            arr[j] = arr[i];
        }
        arr[i] = key;
        qsort(arr, l, i - 1);
        qsort(arr, i + 1, r);

    }


    public static void main(String[] args) {
        int[] arr = {47, 29, 71, 99, 78, 19, 24, 0};
        System.out.println("original arr :" + Arrays.toString(arr));
        System.out.println("bubble sort :" + Arrays.toString(bubbleSort2(arr)));
        System.out.println("quick sort :" + Arrays.toString(quickSort(arr)));
    }

}
