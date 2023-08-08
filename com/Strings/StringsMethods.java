package com.Strings;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "Tanvi Sharma";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());

        String str2 = "tanvi sharma";
        System.out.println(str2.equals(str));
        System.out.println(str2.equalsIgnoreCase(str));
        System.out.println(str2.compareTo(str));

        String str3 = "    abcde    ";
        System.out.println(str3.trim());

        System.out.println(str.indexOf('a'));
        System.out.println(str.charAt(3));
        System.out.println(str.contains("b"));
        System.out.println(str.replace("n","b"));
        System.out.println(str.substring(0,3));
        System.out.println(str.toCharArray());


    }
}
