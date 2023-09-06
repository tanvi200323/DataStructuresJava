package com._6Recursion;

public class _6SumOfDigits {
    public static void main(String[] args) {
        int num = 1342;
        int sum = sumdigits(num);
        System.out.println(sum);
    }
    static int sumdigits(int num){
        if(num == 0){
            return 0;
        }
        int last = num%10;
        return last+sumdigits(num/10);
    }
}
