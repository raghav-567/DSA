package Leetcode;

public class L3370 {
    public static void main(String[] args) {

    }
    public int smallestNumber(int n) {
        while(true)
        {
            if((n&(n+1))==0)
                return n;
            n++;
        }
    }
}
