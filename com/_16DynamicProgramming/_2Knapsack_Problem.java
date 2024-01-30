package com._16DynamicProgramming;

import java.util.Scanner;

public class _2Knapsack_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = 10;
        int[] wt = {1, 3, 4, 6};
        int[] val = {20, 30, 10, 50};
        int profit = Knapsack(W, wt, val, val.length);
        System.out.println(profit);
    }
    static int KnapsackRec(int W, int[] wt, int[] val, int n, int[][] dp){
        if(n==0 || W==0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            dp[n][W] = Integer.max((val[n-1] + KnapsackRec(W-wt[n-1], wt, val, n-1, dp)), KnapsackRec(W, wt, val, n-1, dp));
            return dp[n][W];
        }
        else{
            dp[n][W] = KnapsackRec(W, wt, val, n-1, dp);
            return dp[n][W];
        }

    }
    static int Knapsack(int W, int[] wt, int[] val, int n){
        int[][] dp = new int[n+1][W+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<W+1; j++){
                dp[i][j] = -1;
            }
        }

        return KnapsackRec(W, wt, val, n, dp);
    }
}
