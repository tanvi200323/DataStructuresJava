package com.Arrays;

public class MaxSumSubarr {
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(arr));
        System.out.println(sum2(arr));
        System.out.println(kadane(arr));
    }
    static int sum(int[] arr){
        //NAIVE APPROACH - O(N^3) complexityyyyy
        int finalsum = Integer.MIN_VALUE; //bcoz of negative numbers humne yeh opt kra hai
        for(int i=0; i< arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currentsum = 0;
                for(int k=i; k<=j; k++){ //k wale ki zrurt hi nahi thi bhaiyaaa bcoz sum hi toh nikal
                                         // rhe h hum, print thodi na krvana hai jo ek ek ko lenge hum
                    currentsum += arr[k];
                }
                if(currentsum > finalsum){
                    finalsum = currentsum;
                }
            }
        }
        return finalsum;
    }

    //O(n^2)
    static int sum2(int[] arr){
        int finalsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int currentsum = 0;
            for(int j=i; j<arr.length; j++){
                currentsum += arr[j];
            }
            if(currentsum > finalsum){
                finalsum = currentsum;
            }
        }
        return finalsum;
    }

    //O(N) - KADANE'S ALGORITHM
    static int kadane(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length ;i++){
            sum += arr[i];
            if(sum>maxsum){
                maxsum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}
