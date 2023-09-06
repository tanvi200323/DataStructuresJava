package com._7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _9SudokuSolver {
    public static void main(String[] args) {
        int board[][] =
                { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if(solveSudoku(board, 0, 0, 9)){
            print(board, 9);
        }
        else{
            System.out.println("No solution exists");
        }
    }

    static boolean solveSudoku(int[][] board, int row, int col, int n){
        if(row==n-1){
            return true;
        }

        if(col==n){
            row++;
            col=0;
        }

        if(board[row][col] != 0){
            return solveSudoku(board, row, col+1, n);
        }

        for(int digit=1; digit<=n; digit++){ 
            if(isSafe(board, row, col, digit, n)){
                board[row][col] = digit;
                if(solveSudoku(board, row, col+1, n)){ //col+1 mein add kr bhi skte hai ya nahi, re-check again after adding a number
                    return true;
                }
                else{
                    board[row][col] = 0; //if not safe to put digit, BACKTRACK!
                }
            }
        }

        return false; //no solution
    }

    static boolean isSafe(int[][] board, int row, int col, int digit, int n){
        //check horizontal
        for(int i=0; i<n; i++){
            if(board[row][i] == digit){
                return false;
            }
        }

        //check vertical
        for(int i=0; i<n; i++){ 
            if(board[i][col] == digit){
                return false;
            }
        }

        //check inside every 3X3 matrix
        int startrow = row - row % 3;
        int startcol = col - col % 3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[startrow+i][startcol+j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    static void print(int[][] board, int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
