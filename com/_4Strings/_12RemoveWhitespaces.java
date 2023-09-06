package com._4Strings;

public class _12RemoveWhitespaces {
    public static void main(String[] args) {
        String str ="Tan   vi Sha  r m a   ";
        String s = str.replaceAll("\\s","");
//        String s = str.replaceAll(" ","");   -- Same thing
        System.out.println(s);
    }
}
