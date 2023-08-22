package com.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        divide(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void divide(int[] arr, int n){
        if(n<2){
            return;
        }

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0;i<mid;i++){
            left[i] = arr[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid] = arr[i];
        }

        divide(left,mid);
        divide(right,n-mid);

        mergesort(arr,left,right);
    }
    static void mergesort(int[] arr,int[] left, int[] right){
        int i = 0 ;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
