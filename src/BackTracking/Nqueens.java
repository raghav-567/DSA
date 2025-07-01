package BackTracking;


public class Nqueens {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] maze = new boolean[n][n];    //false values
        System.out.print(NQueens(0,maze));


    }
    public static int NQueens(int row,boolean[][] maze ){
        int count = 0;
        if(row == maze.length){
            display(maze);
            System.out.println();
            return 1;
        }
        for(int j = 0 ; j < maze.length ; j++){
            if(issafe(row,j,maze)){
                maze[row][j] = true;
                count = count+NQueens(row+1,maze);      //if safe , move to next row  , if not move to next column in called row
                maze[row][j] = false;         // backtrack
            }
        }
        return count;
    }

    private static boolean issafe(int row, int col, boolean[][] maze) {
        int n = maze.length-1;
        for(int i = 0 ; i < row ; i++){
            if(maze[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1 ; i <= maxLeft ; i++){
            if(maze[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,n-col);
        for(int i = 1 ; i <= maxRight ; i++){
            if(maze[row-i][col+i]){
                return false;
            }
        }
return true;

    }

    private static void display(boolean[][] maze) {
        for(boolean[] row : maze){
            for(boolean element : row){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();

        }
    }
}
