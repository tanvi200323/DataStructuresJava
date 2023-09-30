package com._8OOPs;

public class _29This4 { //pass as an arg in method
    void m1(_29This4 t){
        System.out.println("I'm in m1");
    }
    void m2(){
        m1(this);  //--> this refers to the reference variable of class (t)
    }

    public static void main(String[] args) {
        _29This4 obj = new _29This4();
        obj.m2();
    }
}
