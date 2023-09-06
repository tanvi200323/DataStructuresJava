package com._6Recursion;

public class _9PalindromeOrNot {
    public static void main(String[] args) {
        int num = 12321;
        rev(num);
        if(num == sum){
            System.out.println("YES, PALINDROME");
        }
        else{
            System.out.println("NO, NOT A PALINDROME");
        }
    }
    /*static int rev(int num, int digits){   THIS WILL NOT WORK AS IT NEEDS DIGITS ALSO
        if(num%10 == num){
            return num;
        }
        return (num%10)*(int)(Math.pow(10,digits-1)) + rev(num/10,digits-1);
    }*/
    static int sum=0;
    static void rev(int num){
        if(num==0){
            return;
        }
        int last=num%10;
        sum = sum*10+last;
        rev(num/10);
    }

}
