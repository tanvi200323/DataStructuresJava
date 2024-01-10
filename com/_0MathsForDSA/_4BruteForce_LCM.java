package com._0MathsForDSA;

import java.util.Scanner;

public class _4BruteForce_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.max(a,b);

        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        System.out.println(res);
    }
}
