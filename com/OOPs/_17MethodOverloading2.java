package com.OOPs;

public class _17MethodOverloading2 {
    void show(Object a){
        System.out.println("obj method");
    }
    void show(String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        _17MethodOverloading2 t = new _17MethodOverloading2();
        t.show("a"); //give preference to child method
    }
}
