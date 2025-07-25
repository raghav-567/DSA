package BackTracking;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
public static boolean solve(int[][] board){
    int row = -1;
    int col = -1;
    int n = board.length;

    boolean emptyLeft = true;

    for(int i = 0 ; i < n ; i++ ){
        for(int j = 0 ; j < n ; j++){
            if(board[i][j] == 0){
                row = i;
                col = j;
                emptyLeft = false;
                break;
            }
        }
        if(emptyLeft == false)break;
    }
    if(emptyLeft == true) return true;

    for(int i = 1 ; i <= 9 ; i++){
        if(isSafe(row,col,i,board)){
            board[row][col] = i;
            if(solve(board)){
                return true;
            }
            else {
                board[row][col] = 0;
            }
            }

    }
    return false;
}
public static boolean isSafe(int row, int col , int num, int[][] board){
    for(int i = 0 ; i < board.length; i++){
        if(board[i][col] == num){
            return false;
        }
    }
    for(int i = 0 ; i < board.length; i++){
        if(board[row][i] == num){
            return false;
        }
    }
    int sqrt = (int)(Math.sqrt(board.length));
    int startrow = row - row % sqrt;
    int startcol = col - col % sqrt;
    for(int i = startrow ; i < startrow + sqrt ; i++){
        for(int j = startcol ; j < startcol + sqrt; j++){
            if(board[i][j] == num){
                return false;
            }
        }
    }
    return true;
}

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
