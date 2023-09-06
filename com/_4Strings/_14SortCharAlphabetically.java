package com._4Strings;

import java.util.Arrays;

public class _14SortCharAlphabetically {
    public static void main(String[] args) {
        String str = "rock";

        //Without sort() method:
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        //With sort() method;
        char arr2[] = str.toCharArray();
        Arrays.sort(arr2);
        System.out.println(new String(arr2));
    }

}
