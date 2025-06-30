package BackTracking;


import java.util.ArrayList;
import java.util.Arrays;

public class Maze4 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] arr = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        path("",maze,0,0,1,arr);

    }
    public static ArrayList<String> path(String A ,boolean[][] maze, int row,int column,int step,int[][] arr ){
        if(row == arr.length-1 && column == arr[0].length-1){
            arr[row][column] = step;
            for(int[] k : arr){
                System.out.println(Arrays.toString(k));
            }
            System.out.println(A);
            return new ArrayList<>();
        }
        if(!maze[row][column]){
            return new ArrayList<>();
        }
        maze[row][column] = false;
        arr[row][column] = step;
        ArrayList<String> list = new ArrayList<>();
        if(row > 0){
            list.addAll(path(A+"U",maze,row-1,column,step+1,arr));
        }
        if(row < arr.length-1){
            list.addAll(path(A+"D",maze,row+1,column,step+1,arr));
        }
        if(column > 0){
            list.addAll(path(A+"L",maze,row,column-1,step+1,arr));
        }
        if(column < arr[0].length-1){
            list.addAll(path(A+"R",maze,row,column+1,step+1,arr));
        }
        maze[row][column] = true;
        arr[row][column] = 0;
        return list;
    }
}
