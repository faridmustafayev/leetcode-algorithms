package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        Sum3 sum3 = new Sum3();
        System.out.println(sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(sum3.threeSum(new int[]{-2, 0, 0, 2, 2}));

    }
}

class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> values = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    values.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }

            }

        }

        return values;
    }
}
