package Leetcode;

public class L717 {
    public static void main(String[] args) {

    }
    public boolean isOneBitCharacter(int[] bits) {
        int O = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0 ; i--) {
            O++;
        }
        if (O % 2 > 0) return false;
        return true;
    }
}
