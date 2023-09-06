package com._3Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){ //runs for every pass expect for those who are already sorted
            swapped = false;
            for(int j=1; j<(arr.length-i); j++){ //j<arr.length-i : taki jo already sorted elts hain end mein vaha tk jake time pass na kre
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break; //taki efficient bnjaye code
            }
        }
    }
}
