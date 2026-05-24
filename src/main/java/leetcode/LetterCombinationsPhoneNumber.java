package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {

        LetterCombinations letterCombinations = new LetterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));

    }
}

class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        /*
        2 -> a b c
        3 -> d e f
        4 -> g h i
        5 -> j k l
        6 -> m n o
        7 -> p q r s
        8 -> t u v
        9 -> w x y z
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            String letters = map.get(digit);

            List<String> temp = new ArrayList<>();
            for (String current : result) {
                for (int k = 0; k < letters.length(); k++) {
                    temp.add(current + letters.charAt(k));
                }
            }

            result = temp;
        }

        return result;
    }
}
