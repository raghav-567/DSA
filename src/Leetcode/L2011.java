package Leetcode;

public class L2011 {
    public static void main(String[] args) {

    }
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String i : operations){
            if(i.charAt(1) == '-'){
                ans -= 1;
            }
            else{
                ans += 1;
            }
        }
        return ans;
    }
}
