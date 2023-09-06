package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class _16StringSubsets {
    public static void main(String[] args) {
        ArrayList<String> list = subsets("","abc");
        System.out.println(list);
        System.out.println("------------------------------");
        subsetsprint("","abc");
    }
    static ArrayList<String> subsets(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsets(p+ch,up.substring(1));
        ArrayList<String> right = subsets(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subsetsprint(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetsprint(p+ch,up.substring(1));
        subsetsprint(p,up.substring(1));
    }
}
