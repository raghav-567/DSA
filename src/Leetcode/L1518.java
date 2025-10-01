package Leetcode;

public class L1518 {
    public static void main(String[] args) {

    }

        public int numWaterBottles(int numBottles, int numExchange) {
            int ans = 0;
            int emptyBottle = 0;
            while(numBottles>0){
                ans += numBottles;
                emptyBottle += numBottles;
                numBottles = emptyBottle/numExchange;
                emptyBottle %= numExchange;

            }
            return ans;
        }

}
