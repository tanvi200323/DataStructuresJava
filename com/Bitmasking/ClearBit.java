package com.Bitmasking;

public class ClearBit {
    public static void main(String[] args) {
        int n = 201; //11001001
        int i = 3;
        int mask = 1<<i;
        int invertMask = ~(mask);
        System.out.println("n before changing bit: "+n);
        n = n & invertMask;
        System.out.println("n after changing 3rd bit to 0: "+n);
    }
}
