package leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        LongestPalindromic palindromic = new LongestPalindromic();
//        String value1 = palindromic.longestPalindrome("cbaabde");
//        String value2 = palindromic.longestPalindrome("cbababg");
//        String value3 = palindromic.longestPalindrome("cbbd");
//        String value4 = palindromic.longestPalindrome("babad");
        String value5 = palindromic.longestPalindrome("acc");
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value3);
//        System.out.println(value4);
        System.out.println(value5);

    }

}


class LongestPalindromic {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {

            int left = i - 1;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }

                left--;
                right++;
            }

            left = i - 1;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }

                left--;
                right++;
            }
        }

        return longest;
    }
}