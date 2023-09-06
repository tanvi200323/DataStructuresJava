package com._7BackTracking;

import java.nio.file.Path;
import java.util.ArrayList;

public class _3MazeDiagonal {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
        System.out.println("----------------------------------------------------------------------");
        PathPrint("",3,3);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(PathStoreAL("",3,3));
    }

    static int countPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int first = countPaths(r-1,c);
        int second = countPaths(r,c-1);
        int third = countPaths(r-1,c-1);

        return first+second+third;
    }
    static void PathPrint(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            PathPrint(p+"D",r-1,c);
        }
        if(c>1){
            PathPrint(p+"R",r,c-1);
        }
        if(r>1 && c>1){
            PathPrint(p+"d",r-1,c-1);
        }
    }

    static ArrayList<String> PathStoreAL(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> al = new ArrayList<>();
        if(r>1){
            al.addAll(PathStoreAL(p+"D",r-1,c));
        }
        if(c>1){
            al.addAll(PathStoreAL(p+"R",r,c-1));
        }
        if(r>1 && c>1){
            al.addAll(PathStoreAL(p+"d",r-1,c-1));
        }
        return al;
    }
}
