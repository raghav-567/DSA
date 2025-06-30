package BackTracking;


public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] maze = new boolean[n][n];
    }
    public static void NQueens(int row,int column,boolean[][] maze ){
        if(row == maze.length ){
            display(maze);
            return ;
        }
        maze[row][column] =
    }

    private static void display(boolean[][] maze) {
        for(boolean[] row : maze){
            for(boolean element : row){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
