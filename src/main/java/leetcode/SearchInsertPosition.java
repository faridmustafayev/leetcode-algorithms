package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5}, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target > nums[i] && target < nums[j]) {
                    return i + 1;
                } else {
                    break;
                }
            }
        }

        int maxValue = Integer.MAX_VALUE;

        for (int num : nums) {
            if (maxValue > num) {
                maxValue = num;
            }
        }

        if (maxValue > target) {
            return 0;
        }

        return nums.length;

    }

}
