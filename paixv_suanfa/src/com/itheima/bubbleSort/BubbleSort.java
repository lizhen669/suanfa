package com.itheima.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5, 9, 7, 4, 1, 3, 2, 8};
        int [] array2 = {1, 2, 3, 4, 5, 7, 8, 9};

        bubbleV1(array);
        //bubbleV2(array);
    }

    private static void bubbleV2(int[] array) {
        // 每轮冒泡需要比较的次数
        int n = array.length - 1;
        while (true) {
            // 最后进行交换位置的索引
            int last = 0;
            // 一轮冒泡
            for (int i = 0; i < n; i++) {
                int count = i + 1;
                System.out.println("第" + count + "次比较");
                if (array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                    // 将交换位置的元素索引赋给last
                    last = i;
                }
            }
            n = last;
            System.out.println("排好后的数组： " + Arrays.toString(array));

            if (n == 0){
                break;
            }
        }
    }


    private static void bubbleV1(int[] array) {
        //控制冒泡的轮次次数
        for (int j = 0; j < array.length - 1; j++) {
            //定义是否进行了交换的标记
            boolean flag = false;
            //一轮冒泡
            for (int i = 0; i < array.length - 1 - j; i++) {
                int countI = i + 1;
                System.out.println("第" + countI + "次比较");
                if (array[i] > array[i + 1]){
                    swap(array, i, i+1);
                    //交换了，设为true
                    flag = true;
                }
            }
            int countJ = j + 1;
            System.out.println("第" + countJ +"轮排好后的数组： " + Arrays.toString(array));

            //没有交换，直接退出冒泡
            if (!flag){
                break;
            }
        }
    }

    public static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
