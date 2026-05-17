package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
//        System.out.println(romanToInt("MCMXCIV"));

        RomanToInteger toInteger = new RomanToInteger();
        System.out.println(toInteger.romanToInteger("III"));
        System.out.println(toInteger.romanToInteger("LVIII"));
        System.out.println(toInteger.romanToInteger("MCMXCIV"));
        System.out.println(toInteger.romanToInteger("IV"));
        System.out.println(toInteger.romanToInteger("CMLII"));
        System.out.println(toInteger.romanToInteger("D"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));

            if (currentValue >= prevValue) {
                sum += currentValue;
            } else {
                sum -= currentValue;
            }

            prevValue = currentValue;
        }
        return sum;
    }

    public int romanToInteger(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;

        if (s.length() == 1) {
            return map.get(String.valueOf(s.charAt(0)));
        }

        int value = map.get(String.valueOf(s.charAt(0)));
        sum += value;

        if (map.get(String.valueOf(s.charAt(0))) < map.get(String.valueOf(s.charAt(1)))) {
            sum = -sum;
        }

        int last;
        if (s.length() == 2) {
            if (map.get(String.valueOf(s.charAt(0))) < map.get(String.valueOf(s.charAt(1)))) {
                 last = map.get(String.valueOf(s.charAt(1))) - map.get(String.valueOf(s.charAt(0)));
            } else {
                last = map.get(String.valueOf(s.charAt(0))) + map.get(String.valueOf(s.charAt(1)));
            }

            return last;
        }

        int i;
        for (i = 1; i < s.length(); i++) {
            Integer integer1 = map.get(String.valueOf(s.charAt(i)));

            if (i + 1 < s.length()) {
                Integer integer2 = map.get(String.valueOf(s.charAt(i + 1)));

                if (integer1 < integer2) {
                    sum -= integer1;
                } else if (integer1 > integer2) {
                    sum += integer1;
                } else {
                    sum += integer1;
                }
            }
        }

        if (i == s.length()) {
            sum += map.get(String.valueOf(s.charAt(s.length() - 1)));
        }

        return sum;

    }

}
