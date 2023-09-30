package com._8OOPs;

abstract class Z{
    int tyres;
    abstract void start();  // if method-abstract, class should also be abstract
    //if class extends an abstract class, it must have to implement abstract methods of super class
}

class Y extends Z{
    void start(){
        System.out.println("Starts with key! ");
    }
}
public class _23AbstractClass extends Z{
    void start(){
        System.out.println("Starts with Kick! ");
    }

    public static void main(String[] args) {
        //Z t = new Z();  --> Z is abstract-can't be instantiated
        _23AbstractClass t = new _23AbstractClass();
        t.start();
    }
}
