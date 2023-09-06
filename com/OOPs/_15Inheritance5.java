package com.OOPs;
//HIERARCHICAL INHERITANCE
class Oops5{
    void showA(){
        System.out.println("A class");
    }
}

class Encapsulation extends Oops5{
    void showB(){
        System.out.println("B class");
    }
}
public class _15Inheritance5 extends Oops5{
    void showC(){
        System.out.println("C class");
    }

    public static void main(String[] args) {
        Oops5 obj1 = new Oops5();
        obj1.showA();
//        obj1.showB();
//        obj1.showC();
        System.out.println("--------------------");

        _15Inheritance5 obj2 = new _15Inheritance5();
        obj2.showA();
//        obj2.showB();
        obj2.showC();
        System.out.println("--------------------");

        Encapsulation obj3 = new Encapsulation();
        obj3.showA();
        obj3.showB();
//        obj3.showC();
    }
}
