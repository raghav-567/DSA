package Recursion;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,66,4,22,11,12,1112,112};
        System.out.println(Found(arr,112,0));
        System.out.println(I_Found(arr,112,0));
    }

    private static boolean Found(int[] arr, int target, int i) {
        if(i >= arr.length){
            return false;
        }
        if(target != arr[i]){
            return Found(arr,target,i+1);
        }
        return true;
    }
    private static int I_Found(int[] arr, int target, int i) {
        if(i >= arr.length){
            return -1;
        }
       if(target == arr[i]){
           return i;
       }
       else{
           return I_Found(arr,target,i+1);
       }
    }
}
