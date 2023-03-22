package com.itheima.binartSearch;

/**
 * 二分查找
 * 以及应对整数溢出的方法
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1, 5, 8, 11, 19, 22, 31, 35, 40, 45, 48, 49, 50};
        int target = 48;
        int index = binarySearch(array, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] a, int t){
        int l = 0;
        int r = a.length - 1;
        int m;
        while (l <= r){
            // 1.m = (l + r)/2;

            // 下面是应对整数溢出的方法
            // 2.m = l + (r - l)/2; <==== //m = l - l/2 + r/2;
            // 3.用位移运算符,像右边移动一位相当于除以二
            m = (l + r) >>> 1;
            if (a[m] == t){
                return m;
            }if (a[m] > t){
                r = m - 1;
            }else {
                l = m + 1;
            }
        }
        return -1;
    }
}
