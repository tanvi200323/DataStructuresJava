package com.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class toString {
    public static void main(String[] args) {
        Integer num = new Integer(56); //Wrapper class- Integer
        System.out.println(num.toString());
        //we can use so many functions by using wrapper class(num.func)
        System.out.println(new int[]{1,2,3,4}); //Uses internal toString() method
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); //uses toString() method of Arrays class(FUNCTION OVERRIDING)
     }
}
