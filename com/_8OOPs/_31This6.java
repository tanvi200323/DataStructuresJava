package com._8OOPs;

public class _31This6 {
    _31This6 m1(){  //return type - class instance
        return this; //--> this returns instance of current class
    }
    public static void main(String[] args) {
        _31This6 t = new _31This6();
        System.out.println(t.m1());
    }
}
