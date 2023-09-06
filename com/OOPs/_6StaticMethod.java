package com.OOPs;

import java.lang.invoke.MethodHandle;

public class _6StaticMethod {
    public static void main(String[] args) {
        Method.change();//calling change method

        Method s1 = new Method(1843,"tanvuu");
        Method s2 = new Method(3232,"Tanviiii");
        s1.display();
        s2.display();
    }
}

class Method{
    int roll;
    String name;
    static String college="Chitkara";

    static void change(){
        college = "ShitKara";
    }

    Method(int roll, String name){
        this.roll=roll;
        this.name=name;
        Method.college=college;
    }

    void display(){
        System.out.println(roll+": "+name+": "+college);
    }
}
