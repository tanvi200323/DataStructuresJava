package com.Bitmasking;

public class SetBit1 { //program to change bit 1 to 0, no change if already 1
    public static void main(String[] args) {
        int n = 14; //1110 ==> 1111
        int i = 0;
        int mask = 1<<i;
        System.out.println("num before: "+n);
        n = n|mask;
        System.out.println("num after: "+n);
    }
}
