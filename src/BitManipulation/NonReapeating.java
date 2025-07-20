package BitManipulation ;
public class NonReapeating {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2,2,2,5, 3, 3, 3};
        int result = findNonRepeating(arr);
        System.out.println("Non-repeating element: " + result);
    }

    public static int findNonRepeating(int[] arr) {
        int[] bitCount = new int[32]; // To store the count of each bit (32-bit integers)

        // Count the bits at each position
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                bitCount[i] += (num >> i) & 1; // Extract the i-th bit and add to count
            }
        }
        for(int i = 0; i <= 7 ; i++){

        }

        // Reconstruct the result from bits
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) { // If the count modulo 3 is non-zero, it belongs to the non-repeating number
                result |= (1 << i); // Set the i-th bit in the result
            }
        }

        return result;
    }
}
