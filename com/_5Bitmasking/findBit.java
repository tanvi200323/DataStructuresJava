package com._5Bitmasking;

public class findBit { //find ith bit
    public static void main(String[] args) {
//        int num = 87; //(1010111) <-- counting start from here(0,1,2....)
//        int i = 5;
//        int shift = num>>i; //bit is shifting at the end so that we could mask it
//        if( (shift&1) == 0){
//            System.out.println("0");
//        }
//        else{
//            System.out.println("1");
//        }

        int num = 87;
        int i = 4;
        int mask = 1; //binary mein bhi 1 hi h
        mask = mask<<i;
        if((num&mask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
