package com._8OOPs;
//similar to abstract class but have all methods ABSTRACT
//Support Multiple Inheritance

interface I1{   //uses 'implements' keyword
    public abstract void show();
}
public class _24Interfaces implements I1{
    public void show(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        _24Interfaces t = new _24Interfaces();
        t.show();
    }
}
