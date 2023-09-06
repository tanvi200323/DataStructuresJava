package com._1Arrays;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(countSubArrays(arr,0,0));
    }
    static int countSubArrays(int[] arr, int start, int end){
        if(start == arr.length){
            return 0;
        }
        if(end == arr.length){
            return countSubArrays(arr, start+1, start+1);
        }
        else{
            return 1+countSubArrays(arr,start,end+1);
        }
    }
}
