package com._7BackTracking;

import java.util.ArrayList;

public class _2MazePathPrint {
    public static void main(String[] args) {
        pathPrint("",3,3);
        System.out.println("---------------------------------------");
        System.out.println(pathPrintAL("",3,3));
    }
    static void pathPrint(String processed, int r, int c){
        if(r==1 && c==1){
            System.out.println(processed);
            return;
        }
        if(r>1){
            pathPrint(processed+"D",r-1,c);
        }
        if(c>1){
            pathPrint(processed+"R",r,c-1);
        }
    }

    static ArrayList<String> pathPrintAL(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathPrintAL(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathPrintAL(p+"R",r,c-1));
        }
        return list;

    }

}
