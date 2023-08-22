package com.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            //iske baad apni us jgh pe beth jayenge start n end jaha pe voh violate hue

            //this is the reason why if it is already sorted, it will not swap
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr,low,end); //end is before pivot now
        sort(arr,start,high); //start is after pivot now
    }
}
