package com._12StringAlgo;

public class _1NaiveStringMatching {
    public static void main(String[] args){
        String txt = "aaaaab";
        String pat = "aab";
        int index = StringMatch(txt,pat);
        System.out.println(index);
    }
    public static int StringMatch(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        char[] text = txt.toCharArray();
        char[] pattern = pat.toCharArray();

        for(int i=0; i<=n-m; i++){
            for(int j=0; j<m; j++){
                if(pattern[j] != text[i+j]){
                    break;
                }
                if(j == m-1){ //if j reaches m , return i;
                    return i;
                }
            }
        }
        return -1;
    }
}