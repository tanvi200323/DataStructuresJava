package com._6Recursion;

public class _4Factorial {
    public static void main(String[] args) {
        int fact = 5;
        int ans = factorial(fact);
        System.out.println(ans);
    }
    static int factorial(int fact){
        if(fact==0){
            return 1;
        }
        return fact*factorial(fact-1);
    }
}
