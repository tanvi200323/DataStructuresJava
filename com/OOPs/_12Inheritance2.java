package com.OOPs;

class Oops{
    void program(){
        System.out.println("say hi to coding");
    }
}
public class _12Inheritance2 extends Oops{
    public static void main(String[] args) {
        _12Inheritance2 obj1 = new _12Inheritance2();
        obj1.program();   //we can access 'program' method as Oops is a parent class
    }
}
