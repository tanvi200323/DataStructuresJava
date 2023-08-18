package com.Recursion;

public class _8ReverseNum {
    public static void main(String[] args) {
        int num  = 1234;
        int digits = (int)(Math.log10(num))+1;
        int rev = reverse(num,digits);
        System.out.println("METHOD 1:");
        System.out.println(rev);

        System.out.println("------------------------------------------");

        System.out.println("METHOD 2:");
        reverse2(num);
        System.out.println(sum);
    }
    static int reverse(int num, int digits){
        if(num%10 == num){
            return num;
        }
        return (num%10)*(int)Math.pow(10,digits-1) + reverse(num/10,digits-1);
    }
    static int sum=0;
    static void reverse2(int num){ //kind of works like a loop
        if(num==0){
            return;
        }
        int last = num % 10;
        sum = sum*10 + last;
        reverse2(num/10);
    }

}
