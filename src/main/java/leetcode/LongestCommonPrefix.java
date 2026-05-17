package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (i + 1 < strs.length) {
                if (str.equals(strs[i + 1])) {
                    count++;
                }
            }
        }

        if (count == strs.length - 1) {
            return strs[0];
        }

        if (strs[0].length() == 0) {
            return "";
        }

        String shortest = strs[0];
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].length() < shortest.length()) {
                shortest = strs[j];
            }
        }

        for (int i = 0; i < shortest.length(); i++) {

            char value = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != value) {
                    return result.toString();
                }
            }

            result.append(value);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{""}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "fkow"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"babb","caa"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"aabc", "aacb", "aab"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"abca", "abc"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"cir", "car"}));
    }
}
