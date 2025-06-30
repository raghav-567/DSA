package BackTracking;

import java.util.ArrayList;

public class maze3{
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(movementInAllDirection("",0,0,maze));

    }
        public static ArrayList<String> movementInAllDirection(String A,int row , int column,boolean[][] maze){
            if(row == maze.length-1 && column == maze.length-1){
                ArrayList<String> list = new ArrayList<>();
                list.add(A);
                return list;
            }

            if(!maze[row][column]){
                return new ArrayList<>();
            }
            
            maze[row][column]=false;

            ArrayList<String> list = new ArrayList<>();
            if(row > 0){
                list.addAll(movementInAllDirection(A+"U",row-1,column,maze));
            }
            if(row < maze.length-1){
                list.addAll(movementInAllDirection(A+"D",row+1,column,maze));
            }
            if(column > 0){
                list.addAll(movementInAllDirection(A+"L",row,column-1,maze));
            }
            if(column < maze[0].length-1){
                list.addAll(movementInAllDirection(A+"R",row,column+1,maze));
            }
            maze[row][column] = true;
            return list;
        }
    }