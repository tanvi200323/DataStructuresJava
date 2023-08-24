package com.Strings;

public class _1StringsComparison {
    public static void main(String[] args) {
        //SCP
        String name1= "tanvi";
        String name2= "tanvi";

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        //Heap Memory
        String a = new String("tanvi");
        String b = new String("tanvi");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
