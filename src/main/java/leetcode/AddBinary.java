package leetcode;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        BigInteger value1 = new BigInteger(a, 2);
        BigInteger value2 = new BigInteger(b, 2);

        BigInteger sum = value1.add(value2);

        return sum.toString(2);
    }

}
