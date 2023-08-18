package com.Recursion;

public class _7ProdOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int product = prod(n);
        System.out.println(product);
    }
    static int prod(int n){
        if((n%10)==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
