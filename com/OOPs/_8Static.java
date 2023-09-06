package com.OOPs;

public class _8Static {
    public static void main(String[] args) {
        //fun2();
        _8Static obj1 = new _8Static();
        obj1.fun2();
    }

    static void fun(){
        //greeting();   //non-static methods can't be referenced from a static context
        //Make object for greeting
        _8Static obj2 = new _8Static();
        obj2.greeting();
    }

    void greeting(){
        System.out.println("Hello");
    }

    void fun2(){
        fun();
        greeting();
    }
}


