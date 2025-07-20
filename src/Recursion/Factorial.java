package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        int ans = Fact(n);
        System.out.println(ans);
    }

    private static int Fact(int n) {
        if(n==1){
            return 1;
        }
        return n * Fact(n-1);
    }
}
