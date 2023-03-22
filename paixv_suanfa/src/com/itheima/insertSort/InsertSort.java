package com.itheima.insertSort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9, 2, 3, 1, 5, 7, 4, 6, 8};
        insertSort(a);
    }

    private static void insertSort(int[] a) {
        // i代表的是待插入元素的索引
        for (int i = 1; i < a.length; i++) {
            int t = a[i]; //插入元素的值
            int j = i - 1; //代表已排序区域的索引
            while (j >= 0){
                if (t < a[j]){
                    a[j+1] = a[j];
                }else {
                    break; //找到了插入的位置，停止比较
                }
                j--;
            }
            // 插入元素
            a[j+1] = t;
            System.out.println(Arrays.toString(a));
        }
    }
}
