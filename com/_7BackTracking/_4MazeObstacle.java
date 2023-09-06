package com._7BackTracking;

public class _4MazeObstacle {
    public static void main(String[] args) {
        Obstacle("", 0, 0);

        boolean[][] maze =
                        {{true, true, true},
                        {true, false, true},
                        {true, true, true}};
        System.out.println("--------------------------------------");
        ObstacleBoolean(maze,"",0,0);

    }

    static void Obstacle(String p, int r, int c){
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(r==1 && c==1){
            return;
        }

        if(r<2){
            Obstacle(p+"D",r+1,c);
        }
        if(c<2){
            Obstacle(p+"R",r,c+1);
        }
    }

    static void ObstacleBoolean(boolean[][] maze, String p, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        if(r<maze.length-1){
            ObstacleBoolean(maze, p+"D",r+1,c);
        }
        if(c<maze[0].length-1){
            ObstacleBoolean(maze, p+"R",r,c+1);
        }
    }

}
