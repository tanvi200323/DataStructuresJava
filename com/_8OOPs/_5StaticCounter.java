package com._8OOPs;

public class _5StaticCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

class Counter{
    //int count=0; //without static --> 1 1 1
    static int count = 0; // --> 1 2 3

    Counter(){
        count++;
        System.out.println(count);
    }
}
