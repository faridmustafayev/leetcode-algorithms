package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {

        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse(1534236469));

    }
}

class ReverseInt {
    public int reverse(int x) {
        String value = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(value);
        StringBuilder reverse = stringBuilder.reverse();
        String toString = reverse.toString();

        if (toString.contains("-")) {
            toString = "-" + toString.substring(0, toString.length() - 1);
        }

        long l = Long.parseLong(toString);

        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.parseInt(toString);
    }
}