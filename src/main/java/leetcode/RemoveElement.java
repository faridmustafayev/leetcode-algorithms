package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        StringBuilder value = new StringBuilder();

        for (int num : nums) {
            if (num != val) {
                value.append(num);
            }
        }

        int[] def = new int[value.length()];

        for (int i = 0; i < value.length(); i++) {
            def[i] = value.charAt(i) - '0';
        }
        nums = def;

        return nums.length;
    }

}
