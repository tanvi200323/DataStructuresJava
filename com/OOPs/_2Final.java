package com.OOPs;

public class _2Final {
    public static void main(String[] args) {
        final A tanu = new A("Tanvi Sharma");
        //tanu = hi;    WRONG
        tanu.name = "Tannu";   // we can change this because we are changing value of object, not the reference variable name(tanu)
        System.out.println(tanu.name);
    }
}

class A{
    final int num = 10;
    String name;
    A(String name){

        this.name = name;
    }
}
