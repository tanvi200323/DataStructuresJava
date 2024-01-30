package com._16DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class _1CoinChangeProblem {
    static int minCoins(int n, int[] arr, int[] dp){
        if(n == 0){
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(n-arr[i] >= 0){
                int subAns = 0;
                if(dp[n-arr[i]] != -1){ //Agr dp mein exist krta hai
                    subAns = dp[n-arr[i]];
                }else{
                    subAns = minCoins(n-arr[i], arr, dp);
                }
                if(subAns != Integer.MAX_VALUE && subAns+1 < ans){
                    ans = subAns+1;
                }
            }
        }
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n+1]; //0---18 tak k answers store krega
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minCoins(n, arr, dp);
        System.out.println("No. of coins required: "+ans);

        for(int m: dp){
            System.out.print(m+" ");
        }
    }
}
