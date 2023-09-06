package com._7BackTracking;

public class _5Backtrackinggg {
    public static void main(String[] args) {
        boolean[][] maze =
                        {{true, true, true},
                        {true, true, true},
                        {true, true, true}};
        backtrack(maze,"",0,0);
    }
    static void backtrack(boolean[][] maze, String p, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        maze[r][c] = false;  //it means I visited this block in my path

        if(r<maze.length-1){
            backtrack(maze,p+"D",r+1,c);
        }

        if(c<maze.length-1){
            backtrack(maze,p+"R",r,c+1);
        }

        if(r>0){
            backtrack(maze,p+"U",r-1,c);
        }

        if(c>0){
            backtrack(maze,p+"L",r,c-1);
        }

        //this line is where the function will be over
        //so before the func gets removed, also remove the changes made by that function
        maze[r][c] = true;
    }
}
