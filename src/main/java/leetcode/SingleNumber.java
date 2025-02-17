package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : numbers.entrySet()) {
            if (map.getValue() % 2 != 0) {
                return map.getKey();
            }
        }

        return 3;

    }

}
