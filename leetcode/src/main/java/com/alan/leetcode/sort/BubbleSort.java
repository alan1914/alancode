package com.alan.leetcode.sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * time: O(n^2)
     *
     * @param intArr
     */
    public static int[] bubbleSort(int[] intArr) {
        int[] result = Arrays.copyOf(intArr, intArr.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
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

    private static void qsort(int[] a,int l, int r)
    {
//        System.out.println(Arrays.toString(a) +",left:"+ l + ",right:" + r);
        if(l > r)return;
        int key = a[l], i = l,j = r;
        while(i < j)
        {
            while(i < j && a[j] >= key)j--;
            a[i] = a[j];
            while(i < j && a[i] <= key)i++;
            a[j] = a[i];
        }
        a[i] = key;
        qsort(a, l, i - 1);
        qsort(a, i + 1,r);
    }

    public static void main(String[] args) {
        int[] arr = {47, 29, 71, 99, 78, 19, 24, 0};
        System.out.println("original arr :" + Arrays.toString(arr));
        System.out.println("bubble sort :" + Arrays.toString(bubbleSort(arr)));
        System.out.println("quick sort :" + Arrays.toString(quickSort(arr)));
    }

}
