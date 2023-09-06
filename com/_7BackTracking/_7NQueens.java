package com._7BackTracking;
import java.util.*;

public class _7NQueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        for(List<String> arr: ans){
            for(String str: arr){
                System.out.println(str);

            }
            System.out.println();
        }
    }
    static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        charAdder(board, 0, allBoard);
        return allBoard;
    }
    static void charAdder(char[][] board, int col, List<List<String>> allBoard ){
        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                charAdder(board, col+1, allBoard);
                board[row][col] = '.'; //backtrack
            }
        }
    }
    static void saveBoard(char[][] board,List<List<String>> allBoard){
        String row="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    static boolean isSafe(char[][] board, int row, int col){
        //for horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //for vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //for Upper left
        int r=row;
        for(int c=col; r>=0 && c>=0 ; r-- , c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //for Upper Right
        r=row;
        for(int c=col; r>=0 && c<board.length ;r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //for Lower Left
        r=row;
        for(int c=col; r<board.length && c>=0; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //for Lower Right
        r=row;
        for(int c=col; r<board.length && c<board.length ;r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }
}
