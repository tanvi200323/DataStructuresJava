package com._6Recursion;

public class _14RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {60,70,10,20,30,40,50};
        System.out.println(rotatedbs(arr,40,0,arr.length-1));
        System.out.println(rotatedbs(arr,11,0,arr.length-1));
    }
    static int rotatedbs(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<arr[mid]){
                return rotatedbs(arr,target,start,mid-1);
            }
            else{
                return rotatedbs(arr,target,mid+1,end);
            }
        }
        else{
            if(target>arr[mid] && target<=arr[end]){
                return rotatedbs(arr, target, mid+1, end);
            }
            else{
                return rotatedbs(arr,target,start,mid-1);
            }
        }
    }
}
