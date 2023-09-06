package com._4Strings;

import java.util.Arrays;

public class _18StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        char[] arr = str.toCharArray();
        permutations(arr,0);
    }
    static void permutations(char[] arr, int fixedIndex){
        if(fixedIndex == arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = fixedIndex; i<arr.length; i++){
            swap(arr,i,fixedIndex);
            permutations(arr, fixedIndex+1);
            swap(arr,i,fixedIndex);
        }
    }
    static void swap(char[] arr, int i, int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }
}
