package leetcode;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        String value = "";

        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);

        BigInteger multiply = number1.multiply(number2);

        return value + multiply;
    }

}
