package com._8OOPs;

public class _16MethodOverloading1 {
    //can't be performed by just changing the return type.
    //handled by Compiler
    //Static Polymorphism
    //Same Name, Same Class, Diff. no. of, seq. of, type of Arguements

    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        _16MethodOverloading1 t = new _16MethodOverloading1();
        t.show('a');
        //char promoted to int
    }
}
