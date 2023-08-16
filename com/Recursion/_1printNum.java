package com.Recursion;

public class _1printNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("N to 1: ");
        printNto1(n);
        System.out.println("---------------");
        System.out.println("1 to N: ");
        print1toN(n);
    }
    static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
}
