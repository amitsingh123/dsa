package com.amit.sort;

import java.util.Arrays;
import java.util.Random;

public class SortMain {
    private static int[] arr = new int[]{10,5,4,16,2,1};
    public static void main(String[] args) {
        //Selection sort
//        SelectionSort ss = new SelectionSort();
//        print("before sort");
//        ss.sort(arr);
//        print("after sort");

       //Bubble sort
//        BubbleSort bs = new BubbleSort();
//        print("before sort");
//        bs.sort(arr);
//        print("after sort");

//        //Insertion sort
//        InsertionSort is = new InsertionSort();
//        print("before sort");
//        is.sort(arr);
//        print("after sort");

        //Merge sort
        MergeSort ms = new MergeSort();
        print("before sort");
        //ms.mergeSort(arr,0,arr.length-1);
        print("after sort");
    }

    public static void print(String str){
        System.out.println(str);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
