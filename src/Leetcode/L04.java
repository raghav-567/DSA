package Leetcode;

public class L04 {
    public static void main(String[] args) {

    }

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] arr = new int[nums1.length + nums2.length];
            int index1 = 0, index2 = 0, index = 0;
            while(index1 < nums1.length && index2 < nums2.length){
                if(nums1[index1] <= nums2[index2]){
                    arr[index++] = nums1[index1++];
                }else{
                    arr[index++] = nums2[index2++];
                }
            }
            if(index1 == nums1.length){
                for(; index < nums1.length + nums2.length; index++){
                    arr[index] = nums2[index2++];
                }
            }else{
                for(; index < nums1.length + nums2.length; index++){
                    arr[index] = nums1[index1++];
                }
            }
            return arr.length % 2 == 1 ? (double)arr[arr.length/2]:
                    (double)(arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }
    }

