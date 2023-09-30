package com._8OOPs;

public class _7StaticBlock {
    static int a = 4;
    static int b;

    static { //STATIC BLOCK RUNS FIRST(even before main())
        System.out.println("HI I'M INSIDE STATIC BLOCK");   //Static block runs only once, when the first object is created
        // i.e. when the class is loaded for the first time
        b = a*5;
    }
    public static void main(String[] args) {
        System.out.println("HI MAIN()");
        _7StaticBlock obj = new _7StaticBlock();
        System.out.println(a+", "+b);

        _7StaticBlock.b += 3;
        System.out.println(a+", "+b);

    }
}

