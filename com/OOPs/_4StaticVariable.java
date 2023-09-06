package com.OOPs;

import java.rmi.StubNotFoundException;

public class _4StaticVariable {
    public static void main(String[] args) {
        Students s1 = new Students(1852, "Tanvi");
        Students s2 = new Students(8432, "Palak");

        s1.display();
        s2.display();
    }
}

class Students{
    int roll; //Instance variable
    String name;
    static String college = "Chitkara University";  //Static Variable

    Students(int roll, String name){
        this.roll = roll;
        this.name = name;
        Students.college = college;  //Write this or not it's the same thing
    }

    void display(){
        System.out.println(roll + ": "+name+": "+college);
    }
}
