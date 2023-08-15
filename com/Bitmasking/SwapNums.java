package com.Bitmasking;

public class SwapNums {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a^b; //5^7 = 2
        b = a^b; //2^7 = 5
        a = a^b; //2^5 = 7

        System.out.println("a:"+a+", b:"+b);
    }
}
