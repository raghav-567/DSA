package Recursion;

public class Basic {
    public static void main(String[] args) {
        int n = 5;
        PRINT(n);
    }

    private static int PRINT(int n ) {
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return PRINT(n-1);


    }


}
