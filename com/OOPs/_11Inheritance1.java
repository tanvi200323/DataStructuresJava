package com.OOPs;

public class _11Inheritance1 {
    double l;
    double h;
    double w;
    _11Inheritance1(){
        this.l = 1;
        this.h = 1;
        this.w = 1;
    }
    _11Inheritance1(double side){ //cube
        this.l = side;
        this.h = side;
        this.w = side;
    }
    _11Inheritance1(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    _11Inheritance1(_11Inheritance1 old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void info(){
        System.out.println("Running class");
    }
}

class BoxWeight extends _11Inheritance1 {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); //use- Call the parents class constructor, Used to initialize values in parent class
        this.weight = weight;
    }
}
class Main{
    public static void main(String[] args) {
        _11Inheritance1 box1 = new _11Inheritance1();
        _11Inheritance1 box2 = new _11Inheritance1(4.6, 2.3, 4.7);
        _11Inheritance1 box3 = new _11Inheritance1(box2);
        System.out.println(box1.l + " "+box1.w+" "+box1.h);
        System.out.println(box2.l + " "+box2.w+" "+box2.h);
        System.out.println(box3.l + " "+box3.w+" "+box3.h);

        BoxWeight box4 = new BoxWeight();
        System.out.println(box4.l + " "+box4.w+" "+box4.h);
        BoxWeight box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.l + " "+box5.w+" "+box5.h+" "+box5.weight);
    }
}
