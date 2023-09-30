package com._8OOPs;

public class _18MethodOverloading3 {
    void show(String a){
        System.out.println("String method");
    }
    void show(StringBuffer a){
        System.out.println("StringBuffer Method");
    }

    public static void main(String[] args) {
        _18MethodOverloading3 t = new _18MethodOverloading3();
        t.show("abc");  //String is priority
//        t.show(null);  ---> AMBIGUITY ERROR
    }
}
