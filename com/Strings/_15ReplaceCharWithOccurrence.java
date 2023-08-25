package com.Strings;

public class _15ReplaceCharWithOccurrence {
    public static void main(String[] args) {
        String str = "opentext";
        char charToReplace= 't';
        System.out.println(replace(str,charToReplace));
    }
    static String replace(String str, char charToReplace){
        //check char is present in string:
        if(str.indexOf(charToReplace) == -1){
            return "";
        }

        else{
            int count = 1;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch == charToReplace){
                    str = str.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
                    count++;
                }
            }
            return str;
        }
    }
}
