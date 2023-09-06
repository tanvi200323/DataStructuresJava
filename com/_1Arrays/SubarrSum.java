package com._1Arrays;

import java.util.Arrays;

public class SubarrSum {
    public static void main(String[] args) {
        int[] arr = {10,12,2,4,13,19,5};
        int targetsum = 19;
        System.out.println(Arrays.toString(sum(arr,targetsum)));
    }
    static int[] sum(int[] arr, int targetsum){
        //naive approach
        for(int start=0; start<arr.length; start++){
            for(int end=0; end<arr.length; end++){
                int currentsum=0;
                for(int i=start; i<=end; i++){
                    currentsum += arr[i];
                }
                if(currentsum == targetsum){
                    return new int[]{start,end};
                }
            }
        }
        return new int[]{-1};
    }
}
