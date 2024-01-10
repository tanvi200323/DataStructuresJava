package com._7BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _8NKnights {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNKnights(n);
        int count = 0;
        for(List<String> arr: ans){
            for(String str: arr){

                System.out.println(str);
            }
            System.out.println();
            count++;
        }
        System.out.println("total: "+count);
    }
    static List<List<String>> solveNKnights(int n){
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];
        KnightAdder(board,allboards,0);
        return allboards;
    }
    static void KnightAdder(char[][] board, List<List<String>> allboards, int col){
        if(col == board.length){
            saveBoard(board, allboards);
            return;
        }

        for(int row=0; row<board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'K';
                KnightAdder(board, allboards, col+1);
                board[row][col] = '.'; //backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col){
        if(isValid(board,row+2,col-1)) {
            if (row + 2 < board.length && col - 1 >= 0 && board[row + 2][col - 1] == 'K') {
                return false;
            }
        }

        if(isValid(board,row+2,col+1)) {
            if (row + 2 < board.length && col + 1 < board.length && board[row + 2][col + 1] == 'K') {
                return false;
            }
        }

        if(isValid(board,row-1,col+2)) {
            if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2] == 'K') {
                return false;
            }
        }

        if(isValid(board,row+1,col+2)) {
            if (row+1<board.length && col+2<board.length && board[row + 1][col + 2] == 'K') {
                return false;
            }
        }

        return true;
    }

    static void saveBoard(char[][] board, List<List<String>> allboards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length ;i++){
            row = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 'K'){
                    row += 'K';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allboards.add(newBoard);
    }

    static boolean isValid(char[][] board, int row, int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }


}
