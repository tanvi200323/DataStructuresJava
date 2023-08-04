package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last){
        int max = 0;
        for(int i=start; i<=last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
