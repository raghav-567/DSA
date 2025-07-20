package Recursion;

public class triangle {
    public static void main(String[] args) {
        triangle(4,0);

    }
    static void triangle(int row , int column){
        if(row == 0){
            return ;
        }
        if(column < row){
            triangle(row,column+1);
            System.out.print("*");

        }
        else{
            triangle(row-1,0);
            System.out.println();

        }
    }
}
