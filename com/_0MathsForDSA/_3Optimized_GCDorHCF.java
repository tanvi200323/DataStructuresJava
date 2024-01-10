package com._0MathsForDSA;

import java.util.Scanner;

public class _3Optimized_GCDorHCF {
    public static void main(String[] args) {
        //Optimized Euclid's algorithm
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
