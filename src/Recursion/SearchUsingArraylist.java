package Recursion;

import java.util.ArrayList;

public class SearchUsingArraylist {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4222, 4, 222, 111, 44, 4};
        System.out.println(Found(arr, 4, 0, new ArrayList<>()));
    }
        private static ArrayList<Integer> Found ( int[] arr, int target, int i, ArrayList<Integer > list){
            if (i == arr.length) {
                return list;
            }
         if(target == arr[i]){
             list.add(i);
         }
         return Found(arr,target,i+1,list);

    }

}
