package com._4Strings;

public class _8ReverseString {
    public static void main(String[] args) {
        String s = "Tanvi";
        System.out.println(reverse(s,s.length()-1,""));
        System.out.println(reverseStrBuilder(s));
        System.out.println(iterativeReverse(s));
    }
    static String reverse(String s,int i,String r){
        if(i==-1){
            return r;
        }
        char ch = s.charAt(i);
        return reverse(s,i-1,r+ch);
    }
    static String reverseStrBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    static String iterativeReverse(String s){
        char ch[] = s.toCharArray();
        String rev = "";
        for(int i=ch.length-1; i>=0; i--){
            rev += ch[i];
        }
        return rev;
    }
}
