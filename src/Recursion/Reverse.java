package Recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 4672;
        System.out.println("Reversed number " + rev(n));
    }
    private static int revHelper(int n , int sum){
        if(n<=0) return sum;
        int last_digit = n%10;
        sum = sum*10 + last_digit;
        return revHelper(n/10,sum);
    }
    private static int rev(int n) {
        return revHelper(n,0);
    }
}
