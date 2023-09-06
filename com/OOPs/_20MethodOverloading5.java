package com.OOPs;

public class _20MethodOverloading5 {
    void show(int a){
        System.out.println("int");
    }
    void show(int ...a){
        System.out.println("varargs");
    }
    public static void main(String[] args) {
        _20MethodOverloading5 t = new _20MethodOverloading5();
        t.show(10);  //int
        t.show(10,20,30); //varargs
        t.show(); //varargs
    }
}
