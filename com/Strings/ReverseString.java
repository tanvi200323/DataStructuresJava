package com.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Tanvi";
        System.out.println(reverse(s,s.length()-1,""));
    }
    static String reverse(String s,int i,String r){
        if(i==-1){
            return r;
        }
        char ch = s.charAt(i);
        return reverse(s,i-1,r+ch);
    }
}
