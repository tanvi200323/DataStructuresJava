package com._8OOPs;

class Employee{
    private int emp_id; //private id
    public void setterId(int EMP_ID){ //setter method
        emp_id = EMP_ID;
    }
    public int getterId(){ //getter method
        return emp_id;
    }
}
public class _25Encapsulation {
    public static void main(String[] args) {
        Employee t = new Employee();
        t.setterId(101);
        System.out.println(t.getterId());
    }
}
