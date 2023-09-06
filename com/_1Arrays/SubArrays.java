package com._1Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subArrLoop(arr);
        subArrRec(arr,0,0);
    }
    //using LOOP:
    static void subArrLoop(int[] arr){
        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    //using RECURSION:
    static void subArrRec(int[] arr, int start, int end){
        if(start==arr.length){
            return;
        }
        if(end == arr.length){
            subArrRec(arr,start+1,start+1);
        }
        else{
            for(int i=start; i<=end; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            subArrRec(arr,start,end+1);
        }
    }
}
