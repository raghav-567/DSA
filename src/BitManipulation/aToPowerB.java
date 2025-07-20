package BitManipulation;

public class aToPowerB {
    public static void main(String[] args) {
        // we have two things(numsbers) :
        // one -> base;
        // second -> power;
        // we need to convert power in binary form and multiply the base to itself  if the power is equal to 1 in binary
        int n = 3;
        int base = 5;
        int ans = 1;
        while(n != 0){
            if((n & 1) == 1){
                ans *= base;
            }
            base *= base;  // most important
            n = n >>1;
        }
        System.out.println(ans);
    }
}
