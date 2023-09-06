package com.OOPs;

public class _3Finalize {
    public static void main(String[] args) {
        B obj;
        for(int i=0; i<10000000; i++){
            obj = new B("Random");
        }
    }
}

class B{
    String name;
     public B(String name){
         this.name = name;
     }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
