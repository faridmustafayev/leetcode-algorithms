package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        if (cleaned.length() % 2 == 0) {
            int value = cleaned.length() / 2;
            String substring = cleaned.substring(0, value);
            String substring1 = cleaned.substring(value);

            StringBuilder sb = new StringBuilder(substring1);
            String s1 = sb.reverse().toString();

            return substring.equals(s1);
        } else {
            int value = cleaned.length() / 2;
            String substring = cleaned.substring(0, value);
            String substring1 = cleaned.substring(value + 1);

            StringBuilder sb = new StringBuilder(substring1);

            String s1 = sb.reverse().toString();

            return substring.equals(s1);
        }
    }

}
