package com._4Strings;

public class _11ReplaceSpeChar {
    public static void main(String[] args) {
        String s = "Jav%$$aS@t!ar!!";
        String s2 = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s2);
    }
}
