package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elts between 1-N");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;  //(correctindex = value-1) == (3 ki index = 3-1 == 2)

            if(arr[i] != arr[correctIndex]){ //agr correct index pr nhi hai toh swap kro
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;       //vrna aage bdh jao
            }
        }
    }
}
