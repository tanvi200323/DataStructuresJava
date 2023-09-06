package com._2Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BS_2D_SortedStrictly { //2D sorted array will be imagined as 1D sorted array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Enter array elts: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        int[] index = sorted2dsearch(arr,key);
        if(index[0] != -1 && index[1] != -1){
            System.out.println("target found at index: "+ Arrays.toString(index));
        }
        else{
            System.out.println("Target not found");
        }
    }
    static int[] sorted2dsearch(int[][] arr, int key){
        int n = arr.length;
        int m = arr[0].length;

        int lb = 0;
        int ub = n*m - 1;

        while(lb<=ub){
            int mid = lb+(ub-lb)/2;
            if(arr[mid / m][mid % m] == key){
                return new int[]{mid/m, mid%m};    //returning the indexes
            }
            else if(arr[mid / m][mid % m] < key){
                 lb = mid + 1;
            }
            else{
                 ub = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
