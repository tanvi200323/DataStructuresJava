package com._4Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class _3toString {
    public static void main(String[] args) {
        Integer num = new Integer(56); //Wrapper class- Integer
        System.out.println(num.toString());
        //we can use so many functions by using wrapper class(num.func)
        System.out.println(new int[]{1,2,3,4}); //Uses internal toString() method
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); //uses toString() method of Arrays class(FUNCTION OVERRIDING)

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1); //1(int) will be converted into a wrapper class, same as- ("a"+"1")
        System.out.println("tanvi" + new ArrayList<>());
        System.out.println("tanvi" + new Integer(56));
        //System.out.println(new Integer(56) + new ArrayList<>());
        // "+" operator in java use only with PRIMITIVES or STRING(even if one of the object is String)

        System.out.println(new Integer(56) + "" + new ArrayList<>()); //will work
        String str = new Integer(56) + "" + new ArrayList<>();
        System.out.println(str);
     }
}
