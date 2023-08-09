package com.Strings;

import java.util.Scanner;

public class Str_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        Boolean bl = palindrome(str);
        if(bl == true){
            System.out.println("yes, it is a PALINDROME! ");
        }
        else{
            System.out.println("BAD LUCKK");
        }
    }
    static boolean palindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int last = str.length()-1;
        while (start<=last){
            if(str.charAt(start) != str.charAt(last)){
                return false;
            }
            else{
                start++;
                last--;
            }
        }
        return true;
    }
}
