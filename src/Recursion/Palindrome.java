package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 672111276;
        if(rev(n) == n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
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
