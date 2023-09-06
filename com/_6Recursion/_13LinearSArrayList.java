package com._6Recursion;

import java.util.ArrayList;

public class _13LinearSArrayList {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        int ans = findIndex(arr, 0, 9);
        System.out.println(ans);
        findallindex1(arr,0,18);
        System.out.println(list);
        int[] arr2 = {1,2,3,6,4,4,5};

        ArrayList<Integer> listt = new ArrayList<>();
        ArrayList<Integer> ans2 = findallindex2(arr2,0,4,listt);
//        ArrayList<Integer> ans2 = findallindex2(arr2,0,4,new ArrayList<>());
        System.out.println(ans2);
        System.out.println(listt);
        System.out.println(findallindex3(arr2,0,4));
    }
    static int findIndex(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,index+1,target);
    }
    //if we want to print a arraylist:
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex1(int[] arr, int index, int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findallindex1(arr, index+1, target);
    }

    //if we want to return the arraylist:
    static ArrayList<Integer> findallindex2(int[] arr, int index, int target, ArrayList<Integer> list2){
        if(index == arr.length){
            return list2;
        }
        if(arr[index] == target){
            list2.add(index);
        }
        return findallindex2(arr, index+1, target, list2);
    }

    //returning arraylist without passing the arguement
    static ArrayList<Integer> findallindex3(int[] arr,int index, int target){
        ArrayList<Integer> ls = new ArrayList<>();
        if(index == arr.length){
            return ls;
        }
        //stores answers for that function call only
        if(arr[index]==target){
            ls.add(index);
        }
        ArrayList<Integer> addFromBelowCalls = findallindex3(arr, index+1, target);
        ls.addAll(addFromBelowCalls);
        return ls;
    }
}
