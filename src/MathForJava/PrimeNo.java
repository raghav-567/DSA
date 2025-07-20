package MathForJava;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));  // Output will be true
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;  // If n is divisible by i, it's not prime
            }
        }

        return true;  // If no divisors were found, it's prime
    }
}
