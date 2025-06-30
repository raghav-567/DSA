package BackTracking;

import java.sql.Array;
import java.util.ArrayList;

public class Maze2 {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

//        System.out.println(DiagonalMovement("",3,3));
        MazeWithRestrictions(arr,"",0,0);

    }

    private static void MazeWithRestrictions(boolean[][] maze, String path, int row, int col) {
        // If out of bounds or on a blocked cell, return
        if (row >= maze.length || col >= maze[0].length || !maze[row][col]) {
            return;
        }

        // If at the destination cell, print the path
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        // Mark the current cell as visited
        maze[row][col] = false;

        // Move Down
        MazeWithRestrictions(maze, path + "D", row + 1, col);

        // Move Right
        MazeWithRestrictions(maze, path + "R", row, col + 1);

        // Move Diagonally (Down-Right)
        MazeWithRestrictions(maze, path + "V", row + 1, col + 1);

        // Unmark the current cell (backtracking)
        maze[row][col] = true;
    }


    private static ArrayList<String> DiagonalMovement(String s ,int row, int column) {
        if(row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(DiagonalMovement(s + "D",row-1,column));
        }
        if(column > 1){
            list.addAll(DiagonalMovement(s + "R",row,column-1));
        }
        if (column > 1 && row > 1){
            list.addAll(DiagonalMovement(s + "V",row-1,column-1));
        }
        return list;

    }
}
