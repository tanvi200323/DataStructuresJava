package com.Strings;

public class _9PalindromeString {
    public static void main(String[] args) {
        String str = "abcba";
        boolean ans = palindrom(str);
        if(ans==true){
            System.out.println("Yes a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    static boolean palindrom(String str){
        String r = reverse(str,"",str.length()-1);
        if(r.equals(str)){
            return true;
        }
        return false;
    }
    static String reverse(String str,String rev, int i){
        if(i==-1){
            return rev;
        }
        return reverse(str,rev+str.charAt(i),i-1);
    }
}
