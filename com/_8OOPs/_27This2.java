package com._8OOPs;

public class _27This2 {// used to invoke current CLASS METHOD
    void display(){
        System.out.println("hello");
    }
    void show(){
        this.display();
    }
    public static void main(String[] args) {
        _27This2 t = new _27This2();
        t.show();
    }
}
