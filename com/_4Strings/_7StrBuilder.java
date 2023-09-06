package com._4Strings;

public class _7StrBuilder {
    public static void main(String[] args) {
        //print a-z by string:
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
        //String will create new object everytime and Memory will be wasted giving O(N^2) complexity
        //So, we need a dataype that creates only 1 object and changes are made in that object only instead of making new objects
        //So, that datatype is called - STRINGBUILDER

        StringBuilder series2 = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series2.append(ch); //appending characters in 1 object
        }
        System.out.println(series2);
    }
}
