package com._5Bitmasking;

public class NonRepElt {
    // Find the only non-repeating elt in an array where every elt. repeats twice.
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 4, 3, 5, 1};
        int res = 0; //0^n = n
        for(int i=0;i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println(res);
    }
}
