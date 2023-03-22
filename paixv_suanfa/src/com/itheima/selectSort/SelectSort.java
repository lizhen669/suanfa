package com.itheima.selectSort;

import java.util.Arrays;

/**
 * 选择排序-每轮选择最小的元素放到已排序区
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] a = {9, 2, 3, 1, 5, 7, 4, 6, 8};

        selectSort(a);
    }

    private static void selectSort(int[] a) {
        // i代表的是每轮选择最小元素要交换到的目标索引
        for (int i = 0; i < a.length - 1; i++) {
            //记录最小元素的索引
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min] > a[j]){
                    min = j;
                }
            }
            if (min != i){
                swap(a, min, i);
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
