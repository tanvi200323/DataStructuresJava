package com._8OOPs;

class test{  //pass an arg in the constructor call
    test(_30This5 obj){
        System.out.println("test class const");
    }
}
public class _30This5 {
    void m1(){
        test obj2 = new test(this);  //--> this refers to the ref variable of test class const
    }
    public static void main(String[] args) {
        _30This5 obj1 = new _30This5();
        obj1.m1();
    }
}
