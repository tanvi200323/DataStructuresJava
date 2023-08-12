package com.Recursion;

public class _1printNum {
    public static void main(String[] args) {
        int num = 1;
        printnum(num);
    }
    static void printnum(int num){
        System.out.println(num);
        if(num<5) {
            printnum(num + 1);
        }
    }
}
