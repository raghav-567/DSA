package BitManipulation;

import static java.lang.Math.pow;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(find(n));
    }
    public static int find(int n) {
        int sum = 0 ;
        for (int i = 1; n>0 ; i++) {
          int lastIndex = n & 1;
          n = n >> 1;
          sum += lastIndex*pow(5,i) ;
      }
      return sum ;
    }
}
