package com.OOPs;

//Same Name, Different Class, Same no. of, seq. of, type of ARGUEMENTS
//contains INHERITANCE
class Test{
    void show(){
        System.out.println("1");
    }
}
public class _21MethodOverriding1 extends Test{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test x = new Test();
        x.show();
        _21MethodOverriding1 t = new _21MethodOverriding1();
        t.show(); //output depends on class
    }
}
