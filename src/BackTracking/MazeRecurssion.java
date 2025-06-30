package BackTracking;

import java.util.ArrayList;

public class MazeRecurssion {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,false},
                {true,false,false},
                {true,true,true}
        };
        System.out.println(pathcount(3,3));
        System.out.println(path("",3,3));
        System.out.println(pathDiagonal("",3,3));
        System.out.println(pathWithObstacles("",0,0,maze));



    }

    private static ArrayList<String> path(String A , int row,int column) {
        if(row==1 && column==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(A);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(path(A+'d',row-1,column));
        }
        if(column > 1){
            list.addAll(path(A+'r',row,column-1));
        }
        return list;

    }

    private static ArrayList<String> pathDiagonal(String A , int row,int column) {
        if(row==1 && column==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(A);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && column > 1){
            list.addAll(pathDiagonal(A+'s',row-1,column-1));
        }
        if(row > 1){
            list.addAll(pathDiagonal(A+'d',row-1,column));
        }
        if(column > 1){
            list.addAll(pathDiagonal(A+'r',row,column-1));
        }

        return list;

    }


    private static ArrayList<String> pathWithObstacles(String A, int row, int column, boolean[][] maze) {
        if (!maze[row][column]) {
            return new ArrayList<>();
        }

        // Base case: reached bottom-right
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(A);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        // Move down
        if (row + 1 < maze.length && maze[row + 1][column]) {
            list.addAll(pathWithObstacles(A + 'd', row + 1, column, maze));
        }

        // Move right
        if (column + 1 < maze[0].length && maze[row][column + 1]) {
            list.addAll(pathWithObstacles(A + 'r', row, column + 1, maze));
        }

        // Move diagonally
        if (row + 1 < maze.length && column + 1 < maze[0].length && maze[row + 1][column + 1]) {
            list.addAll(pathWithObstacles(A + 's', row + 1, column + 1, maze));
        }

        return list;
    }






    private static int pathcount(int row,int column) {
        if(row==1 || column == 1){
            return 1;
        }
        int right = pathcount(row-1,column);
        int left = pathcount(row,column-1);

        int count = right + left;
        return count ;
    }


}
