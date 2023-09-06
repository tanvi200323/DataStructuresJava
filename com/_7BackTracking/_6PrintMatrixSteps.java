package com._7BackTracking;

import java.util.Arrays;

public class _6PrintMatrixSteps {
    public static void main(String[] args) {
        boolean[][] maze =
                        {{true, true, true},
                        {true, true, true},
                        {true, true, true}};
        int[][] path = new int[maze.length][maze[0].length];
        matrix(maze,"",0,0,path,1);
    }
    static void matrix(boolean[][] maze, String p, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step; //last step is also counted obviously
            for(int[] num: path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
            if(maze[r][c] == false){
                return;
            }

            maze[r][c] = false;  //it means I visited this block in my path
            path[r][c] = step; //Add step you're at

            if(r<maze.length-1){
                matrix(maze,p+"D",r+1,c, path, step+1);
            }

            if(c<maze.length-1){
                matrix(maze,p+"R",r,c+1, path, step+1);
            }

            if(r>0){
                matrix(maze,p+"U",r-1,c, path, step+1);
            }

            if(c>0){
                matrix(maze,p+"L",r,c-1, path, step+1);
            }

            //this line is where the function will be over
            //so before the func gets removed, also remove the changes made by that function
            maze[r][c] = true;
            path[r][c] = 0; //undo changes, backtrack

    }
}
