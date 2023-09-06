package com._4Strings;

public class _10RemovingChars {
    public static void main(String[] args) {
        String str = "bacchaas";
        skipchar("",str);

        String s = skipchar2(str);
        System.out.println(s);

        String string = "bacchhhapplecd";
        System.out.println(skipString(string));

        String ss = "bbappccapple";
        System.out.println(skipAppNotApple(ss));
    }
    static void skipchar(String p, String up){ //p=processed, up=unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skipchar(p,up.substring(1));
        }
        else{
            skipchar(p+ch,up.substring(1));
        }
    }

    static String skipchar2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skipchar2(up.substring(1));
        }
        else{
            return ch+skipchar2(up.substring(1));
        }
    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else {
            return ch+skipString(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}
