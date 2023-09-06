package com._2Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();

        int index = linearsearch(arr,key);
        if(index != -1){
            System.out.println("target found at index: "+index);
        }
        else{
            System.out.println("Target not found !");
        }
    }
    static int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
