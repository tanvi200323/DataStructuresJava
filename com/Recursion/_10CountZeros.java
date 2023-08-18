package com.Recursion;

public class _10CountZeros {
    public static void main(String[] args) {
        int num = 3020409;
        int count = count(num);
        System.out.println(count);
    }
    static int count(int num){
        return counthelper(num,0);
    }
    private static int counthelper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num%10;
        if(rem == 0){
            return counthelper(num/10, count+1);
        }
        return counthelper(num/10, count);
    }
}
