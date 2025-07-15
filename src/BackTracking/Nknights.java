package BackTracking;

public class Nknights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] maze = new boolean[n][n];
        solve(maze,0,0,n);
    }

    private static void solve(boolean[][] maze,int row,int col,int n) {
        if(n == 0){
            display(maze);
            System.out.println();
            return;
        }
        if (row == maze.length) {
            return;
        }

        if (col == maze[0].length) {
            solve(maze, row + 1, 0, n);
            return;
        }
        if (isSafe(row, col, maze)) {
            maze[row][col] = true;
            solve(maze, row, col + 1, n - 1);
            maze[row][col] = false;
        }

        solve(maze, row, col + 1, n);

    }

    private static boolean isSafe(int i, int j,boolean[][] maze) {
        if(j>1 && i>0){
            if(maze[i - 1][j - 2] == true){
                return false;
            }
        }
        if(j<maze.length-2 && i>0){
            if(maze[i - 1][j + 2] == true){
                return false;
            }
        }
        if(j>0 && i>1){
            if(maze[i - 2][j - 1] == true){
                return false;
            }
        }
        if(j < maze.length-1 && i>1){
            if(maze[i - 2][j + 1] == true){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] maze) {
        for(boolean[] row : maze){
            for(boolean element : row){
                if(element){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();

        }
    }
}

