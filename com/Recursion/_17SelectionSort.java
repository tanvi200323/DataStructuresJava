package com.Recursion;

import java.util.Arrays;

public class _17SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionsort(arr,r,c+1,c);//max will be updated to c
            }
            else{
                selectionsort(arr,r,c+1,max);
            }
        }
        else{
            //swap max with last elt
            int temp = arr[max];
            arr[max] = arr[r-1]; //r-1 : bcoz we don't need to sort the already sorted part of the array
            arr[r-1] = temp;

            selectionsort(arr,r-1,0,0);
        }
    }
}
