package com._8OOPs;

public class _28This3 {//can be used to invoke class constructor
    _28This3(){
        this(10);
        System.out.println("no arg const");
    }
    _28This3(int a){
        System.out.println("parametrised const");
    }
    public static void main(String[] args) {
        _28This3 t = new _28This3(); //calls constructor
    }
}
