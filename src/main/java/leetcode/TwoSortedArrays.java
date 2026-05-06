package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSortedArrays {
    public static void main(String[] args) {

        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{2, 2, 4, 4}, new int[]{2, 2, 2, 4, 4});
        System.out.println(medianSortedArrays);

    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length %2 == 0) {
            int index2 = nums.length / 2;
            int index1 = index2 - 1;

            double num1 = nums[index1];
            double num2 = nums[index2];

            return (num1 + num2) / 2;
        } else {
            int index = nums.length / 2;
            return nums[index];
        }
    }
}
