package com._8OOPs;

class Test2{
    void show(){
        System.out.println("1");
    }
}
public class _22MethodOverriding2 extends Test2{
    void show(){
        super.show(); //calls method of super-class
        System.out.println("2");
    }
    public static void main(String[] args) {
        _22MethodOverriding2 t = new _22MethodOverriding2();
        t.show();
    }
}
