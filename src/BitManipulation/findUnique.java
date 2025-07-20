package BitManipulation;

public class findUnique {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int ans= 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

}
