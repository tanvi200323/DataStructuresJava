package com._5Bitmasking;

public class noOfBits {  //find number of bits required to change from A to B
    public static void main(String[] args) {
        //Method 1: (TC: O(Log2n))
        /*int num = 13; //1101;
        int mask = 1;
        int count= 0;
        while(num != 0){
            if((num&mask)==1){
                count++;
            }
            num = num>>1;
        }
        System.out.println("no. of bits to be changed: "+count); */
        int num = 13;
        int count=0;
        while(num != 0){
            num = num & (num-1);
            count++;
        }
        System.out.println("no. of bits to be changed: "+count);
    }
}
