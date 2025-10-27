package Leetcode_contest;

public class Weekly473_2 {
    public static void main(String[] args) {

    }
    public long removeZeros(long n) {
        long digit = 0;
        long ans = 0;
        while(n > 0){
            digit = n % 10;
            if(digit != 0){
                ans = ans * 10 + digit;
            }
            n /= 10;
        }
        long anss = 0;
        while(ans > 0){
            anss = anss * 10 + (ans%10) ;
            ans /= 10;
        }
        return anss;
    }
}
