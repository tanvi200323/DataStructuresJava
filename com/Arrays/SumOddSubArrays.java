package com.Arrays;

public class SumOddSubArrays {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(sum(arr));
    }
    static int sum(int[] arr){
        int totalSum = 0;

        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                int subarrsum = 0;
                for(int i=start; i<=end; i++){
                    subarrsum += arr[i];
                }
                if((end-start+1)%2 != 0){
                    totalSum += subarrsum;
                }
            }
        }
        return totalSum;
    }
}
