package com.OOPs;
//MULTI-LEVEL INHERITANCE
class Java{
    void showA(){
        System.out.println("A class");
    }
}

class Oops4 extends Java{
    void showB(){
        System.out.println("B class");
    }
}
public class _14Inheritance4 extends Oops4{
    void showC(){
        System.out.println("C class");
    }

    public static void main(String[] args) {
        Java obj1 = new Java();
        obj1.showA();
//        obj1.showB();  -->both of these are child classes hence can't be accessed
//        obj1.showC();
        System.out.println("---------------------");

        Oops4 obj2 = new Oops4();
        obj2.showA();
        obj2.showB();
//        obj2.showC();
        System.out.println("---------------------");

        _14Inheritance4 obj3 = new _14Inheritance4();
        obj3.showA();
        obj3.showB();
        obj3.showC();
    }
}


