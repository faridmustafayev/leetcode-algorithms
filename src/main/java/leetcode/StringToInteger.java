package leetcode;

public class StringToInteger {
    public static void main(String[] args) {
        Atoi value1 = new Atoi();
        System.out.println(value1.myAtoi("20000000000000000000"));
//        System.out.println(value1.myAtoi("   -42"));
//        System.out.println(value1.myAtoi("4193 with words"));
//        System.out.println(value1.myAtoi("words and 987"));
//        System.out.println(value1.myAtoi("42abc"));
//        System.out.println(value1.myAtoi("3.14159"));
//        System.out.println(value1.myAtoi("123 456"));

    }
}

class Atoi {
    public int myAtoi(String s) {
        String trim = s.trim();
        String value = "";

        if (trim.length() == 0) {
            return 0;
        }

        char first = trim.charAt(0);

        if (!(first == '+' || first == '-' || (first >= '0' && first <= '9'))) {
            return 0;
        }

        for (int i = 0; i < trim.length(); i++) {

            char charAt = trim.charAt(i);

            if (i == 0 && (charAt == '-' || charAt == '+')) {
                value += String.valueOf(charAt);
                continue;
            }

            if (charAt >= '0' && charAt <= '9') {
                value += String.valueOf(charAt);
            } else {
                break;
            }

        }

        if (value.length() == 1 && (value.charAt(0) == '-' || value.charAt(0) == '+')) {
            return 0;
        }

        try {
            if (Long.parseLong(value) > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (Long.parseLong(value) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        } catch (NumberFormatException ex) {
            if (value.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }

            return Integer.MAX_VALUE;
        }

        return Integer.parseInt(value);
    }
}
