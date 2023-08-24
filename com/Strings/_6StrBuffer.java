package com.Strings;

public class _6StrBuffer {
    public static void main(String[] args) {
        //Constructor 1
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        //Constructor 2
        StringBuffer sb2 = new StringBuffer("Tanvi Sharma");
        System.out.println(sb2.capacity());

        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        //.append():
        sb1.append("Tanvi");
        sb1.append(" is a Good Girl ");

        //.insert():
        sb1.insert(6,"Sharma ");

        //.replace():
        sb1.replace(6,12,"Bist"); //6-11 jayega yeh

        //.delete():
        sb1.delete(6,10);

        //.reverse():
        sb1.reverse();

        String str = sb1.toString();
        System.out.println(str);
    }
}
