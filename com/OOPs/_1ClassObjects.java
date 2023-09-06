package com.OOPs;

public class _1ClassObjects {
    public static void main(String[] args) {
        //Student tanu = new Student();
//        tanu.rno = 1852;
//        tanu.name = "Tanvi Sharma";
//        tanu.marks = 99.89f;

        //using constructor will be easier and efficient
        Student tanu = new Student();    //--> call const. with 0 arguements
//          Student tanu = new Student(1852, "Tanvi", 99.4f);
//          --> call const. with 3 arguements

        //calling method
        System.out.println("-------------------");
        tanu.greeting();
        System.out.println("-------------------");


        System.out.println(tanu.rno);
        System.out.println(tanu.name);
        System.out.println(tanu.marks);
        System.out.println("-------------------");

        Student random = new Student(tanu);
        System.out.println(random.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

//    Student(){
//        this.rno=1833;
//        this.name="Tanvi";
//        this.marks=44.3f;
//    }

    Student(){ //calling a const from another const
        this(13, "charit", 21);
    }

    Student(int rno, String name, float marks){ //constructor overloading
        this.rno = rno;
        this.name= name;
        this.marks= marks;
    }

    Student(Student other){ //constructor that takes value from other object
        this.rno = other.rno;
        this.name = other.name; //'this' will be replaced by 'random' and 'other' will be replaced by 'tanu'
        this.marks = other.marks;
    }

}

