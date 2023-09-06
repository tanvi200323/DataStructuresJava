package com.Strings;

import java.util.ArrayList;

public class _17StringSubsetASCII {
    public static void main(String[] args) {
        subsetAscii("","ab");
        ArrayList<String> ls = subsetAsciiAL("","ab");
        System.out.println(ls);
    }
    static void subsetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetAscii(p+ch,up.substring(1));
        subsetAscii(p,up.substring(1));
        subsetAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subsetAsciiAL(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetAsciiAL(p+ch,up.substring(1));
        ArrayList<String> second = subsetAsciiAL(p,up.substring(1));
        ArrayList<String> third = subsetAsciiAL(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
