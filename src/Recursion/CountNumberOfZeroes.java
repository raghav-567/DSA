package Recursion;

public class CountNumberOfZeroes {
    public static void main(String[] args) {
        int n = 30200002;
        int count = 0;
        System.out.println(counnt(n, count));
    }

    private static int counnt(int n , int count) {
        if(n  == 0){
            return count;
        }
        if( n%10 == 0){
            count ++;
        }
        return counnt(n/10 , count);
    }
}
