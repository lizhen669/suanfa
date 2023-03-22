package com.itheima.quickSort;

import java.util.Arrays;

import static com.itheima.quickSort.QuickSort.swap;

/**
 * 快速排序-双边循环
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8, 1, 4};

        int l = 0;//左边界
        int h = a.length - 1;// 右边界

        //双边循环
        partition(a,l,h);

        //重复单边循环，使用递归方法
        quick(a,l,h);
    }

    /**
     * 双边循环
     * @param a
     * @param l
     * @param h
     */
    private static int partition(int[] a, int l, int h) {
        int pv = a[l]; //基准点的值，数组的最左边
        int i = l; //从左往右找比基准点大的元素，索引
        int j = h; //从右往左找比基准点小的元素，索引

        while (i < j){
            while (i < j && a[j] > pv){
                //一定要加i < j ，不然会i会找过头，找到j的右边去，导致排序不成功
                //从右往左找，找不到就索引减一
                j--;
            }
            while (i < j && a[i] <= pv){
                //一定要加i < j ，不然会i会找过头，找到j的右边去，导致排序不成功
                //一定要加=，不然i从左边开始无法向右走，会导致基准点被误交换
                i++;
            }
            swap(a,i,j);
        }
        swap(a,l,i);
        System.out.println(Arrays.toString(a) + "i=" + i);
        return i;
    }

    public static void quick(int[]a, int l, int h){
        //当左边界与右边界重合或者是左边界大于右边界时停止递归，
        if (l >= h){
            return;
        }

        int p = partition(a, l, h); //上一轮分区后的分区位置的索引值

        //递归方法
        quick(a,l,p-1);
        quick(a,p+1,h);
    }
}
