package com.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        int[] index = linearsearch2d(arr,key);
        System.out.println("Target found at index: "+ Arrays.toString(index));

    }
    static int[] linearsearch2d(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] == key){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
