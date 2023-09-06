package com.OOPs;

import org.w3c.dom.ls.LSOutput;

public class _19MethodOverloading4 {
    void show(int a, float b){
        System.out.println("int float method");
    }
    void show(float a, int b){
        System.out.println("flaot int method");
    }

    public static void main(String[] args) {
        _19MethodOverloading4 t = new _19MethodOverloading4();
        t.show(10,20.5f);
        t.show(20.5f,10);
//        t.show(10,10);  //ambiguity
//        t.show(10.5f,20.5f);  //no suitable method found
    }
}
