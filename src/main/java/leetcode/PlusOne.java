package leetcode;

import java.math.BigInteger;

public class PlusOne {
    public static void main(String[] args) {
        int[] numbers = plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int[] plusOne(int[] digits) {
        String value = "";

        for (int digit : digits) {
            value += digit;
        }

        BigInteger number = new BigInteger(value);
        number = number.add(BigInteger.ONE);

        String newValue = String.valueOf(number);
        int[] lastResult = new int[newValue.length()];

        for (int j = 0; j < lastResult.length; j++) {
            lastResult[j] = newValue.charAt(j) - '0';
        }

        return lastResult;

    }

}
