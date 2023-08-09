package com.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "Tanvi Sharma";

        System.out.println(str.toUpperCase()); //converts a string to uppercase string
        System.out.println(str.toLowerCase()); //converts a string to lowercase string
        System.out.println(str.length()); //return length of the string

        String str2 = "tanvi sharma";
        System.out.println(str2.equals(str)); //checks if 2 strings are equal
        System.out.println(str2.equalsIgnoreCase(str)); //checks if 2 strings are equal but also IGNORES CASE
        System.out.println(str2.compareTo(str)); //compares one string to another and returns the difference between them(dictionary)

        String str3 = "    abcde    ";
        System.out.println(str3.trim()); //removes leading and trailing whitespaces

        System.out.println(str.indexOf('a')); //returns index of a char in a string
        System.out.println(str.charAt(3)); //return char at a specific location
        System.out.println(str.contains("b")); //checks of string contains a char or not
        System.out.println(str.replace("n","b")); //replaces a char
        System.out.println(str.substring(0,3)); //returns substring of a string
        System.out.println(Arrays.toString(str.toCharArray())); //converts string to a char array
        System.out.println(str3.strip()); //removes whitespaces like trim() method, but also removes unicode whitespace characters ensuring cross-platform consistency
        System.out.println(Arrays.toString(str.split("a"))); //splits a string where it finds a particular char, returns array
        String[] strrr = str.split("a");
        System.out.println(Arrays.toString(strrr));

    }
}
