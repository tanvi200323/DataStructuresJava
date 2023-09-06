package com._5Bitmasking;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 32;
        //if(n%2 == 0)   --> slow method
        if((n&1) == 0){   //even number ends with 0
            System.out.println("Even");
        }
        else {            //odd number ends with 1
            System.out.println("Odd");
        }
    }
}
