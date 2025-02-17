package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {3, 4, 1}));
        System.out.println("------------------");
        System.out.println(firstMissingPositive(new int[] {7, 8, 9, 11, 12}));
        System.out.println("------------------");
        System.out.println(firstMissingPositive(new int[] {1, 2, 0}));
    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                numbers.add(num);
            }
        }

        int value = 1;
        while (numbers.contains(value)) {
            value++;
        }

        return value;
    }

}
