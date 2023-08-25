package com.Recursion;

public class _3BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 55, 72, 455, 22};
        int target = 55;
        int index = bs(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
    static int bs(int[] arr, int target, int start, int end){ //s and e bhi lgaya bcoz we need these aage to calculate middle.
        if(start > end){
            return -1;  //elt not found
        }
        int middle = start + (end - start)/2;

        if(arr[middle] == target){
            return middle;
        }
        else if(arr[middle] < target){
            return bs(arr, target, start, middle-1);
        }
        else{
            return bs(arr, target, middle+1, end);
        }
    }
}
