package BitManipulation;

public class NoofDigits {
    public static void main(String[] args) {
        int n = 1011;
        int base = 10;
        System.out.println(count(n, base));
    }

    private static int count(int n , int base ) {
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;
        return ans ;
    }
}
