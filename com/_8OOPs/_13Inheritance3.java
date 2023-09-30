package com._8OOPs;
    //SINGLE INHERITANCE
class Oops3{
    void showA(){
        System.out.println("A class");
    }
}
public class _13Inheritance3 extends Oops3{
    void showB(){
        System.out.println("B class");
    }

    public static void main(String[] args) {
        Oops3 obj1 = new Oops3();
        obj1.showA();
        //obj1.showB();  --> SHOWS ERROR as it's a method of child class\

        System.out.println("----------------------");

        _13Inheritance3 obj2 = new _13Inheritance3();
        obj2.showA();
        obj2.showB();
    }
}
