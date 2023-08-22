package com.Recursion;

public class _15TrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        patternprint(4,0);
    }
    static void patternprint(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            patternprint(row,col+1);
            System.out.print("* ");
//            patternprint(row,col+1);
        }
        else{
            patternprint(row-1,0);
            System.out.println();
//            patternprint(row-1,0);
        }
    }
}
