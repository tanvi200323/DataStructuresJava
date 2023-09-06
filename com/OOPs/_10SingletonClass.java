package com.OOPs;

public class _10SingletonClass {
    private _10SingletonClass(){
        //prevents others from creating instance of class
    }

    private static _10SingletonClass instance;

    public static _10SingletonClass getInstance(){
        if(instance==null){//LAZY INSTANTIATION: the instance is only created the first time this method is called.
            instance = new _10SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        _10SingletonClass obj1 = _10SingletonClass.getInstance();
        _10SingletonClass obj2 = _10SingletonClass.getInstance();
    }
}
