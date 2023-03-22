package com.itheima.quickSort;

import java.util.Arrays;

/**
 * 快速排序-单边循环
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8, 1, 4};
        int l = 0;//左边界
        int h = a.length - 1;// 右边界
        //单边循环
        partition(a,l,h);

        //重复单边循环，使用递归方法
        quick(a,l,h);
    }

    public static void quick(int[]a, int l, int h){
        //当左边界与右边界重合或者是左边界大于右边界时停止递归，
        if (l >= h){
            return;
        }

        int p = partition(a, l, h); //上一轮分区后的分区位置的索引值

        // 递归方法
        quick(a,l,p-1); // 左边小的分区
        quick(a,p+1,h); // 右边大的分区
    }
    //单边循环
    public static int partition(int[] a, int l, int h){
        int pv = a[h]; //基准点元素，数组最右边的元素
        int i = l;// 左边界
        for (int j = l; j <h ; j++) {
            if (a[j] < pv){
                if (i != j) {
                    swap(a, j, i);
                }
                i++;
            }
        }
        if (i != h) {
            swap(a, h, i);
        }
        System.out.println(Arrays.toString(a));
        return i;
    }

    public static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
