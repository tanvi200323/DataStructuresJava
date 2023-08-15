package com.Recursion;

public class _2FibonacciNumbers {
    public static void main(String[] args) {
        int n = 4;
        int ans = fibo(n);
        System.out.println(ans);
        System.out.println(fiboformula(50));
    }
    static int fiboformula(int n){
        return (int)(Math.pow((( 1 + Math.sqrt(5))/ 2 ), n) /Math.sqrt(5));
    }
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2); //linear recurrence relation , inefficient
        }
    }
}
