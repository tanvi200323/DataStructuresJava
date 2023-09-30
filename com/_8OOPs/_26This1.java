package com._8OOPs;

public class _26This1 { //used to invoke current instance variable
    int i;
    void setvalue(int i){
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        _26This1 t = new _26This1();
        t.setvalue(100001);
        t.show();
    }
}
