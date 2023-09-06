package com._2Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BS_2D_RowColwiseSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2, 3, 14}, //--> Row-Wise Sorted
                       {10, 20, 30},
                       {25, 40, 80}};
        /*                ^
                          |
                       Col-Wise Sorted
                         */
        System.out.println("Enter key : ");
        int key = sc.nextInt();
        int[] index = search(arr,key);
        if(index[0] != -1 && index[1] != -1){
            System.out.println("Target found at: "+ Arrays.toString(index));
        }
        else {
            System.out.println("Target not found! ");
        }

    }
    static int[] search(int[][] arr,int key){
        int row = 0;
        int col = arr.length - 1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                return new int[]{row, col};
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
