package leetcode;

import java.util.LinkedList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] ints = sum.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int value : ints) {
            System.out.println(value);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = new LinkedList<>();

        label: for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    if ((nums[i] + nums[j]) == target) {
                        numbers.add(i);
                        numbers.add(j);
                        break label;
                    }
                }

            }
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();

    }

}
