package com._2Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array: "+Arrays.toString(arr));
        System.out.println("Enter key: ");
        int key = sc.nextInt();

        int index = binarysearch(arr,key);
        if(index != -1){
            System.out.println("Target found at index: "+ index);
        }
        else{
            System.out.println("Target not found !");
        }
    }
    static int binarysearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end-start)/2;
            if(key == arr[middle]){
                return middle; //index
            }
            else if (key < arr[middle]) {
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }
}
