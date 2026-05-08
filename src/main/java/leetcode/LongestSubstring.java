package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        int i = ls.lengthOfLongestSubstring("pwwkewew");
        System.out.println(i);
    }
}

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        List<String> values = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            char c = s.charAt(i);
            if (!values.contains(String.valueOf(c))) {
                values.add(String.valueOf(c));
            }
            start = start + 1;

            int def = i;
            for (int j = start; j < s.length(); j++) {

                if (!String.valueOf(s.charAt(def)).equals(String.valueOf(s.charAt(j)))) {
                    if (temp.length() >= 2) {
                        temp += String.valueOf(s.charAt(j));
                    } else {
                        temp += String.valueOf(s.charAt(def)) + String.valueOf(s.charAt(j));
                    }

                    def += 1;

                } else {
                    break;
                }
            }
            values.add(temp);

        }


        for (int i = 0; i < values.size(); i++) {

            String word = values.get(i);
            String temp = "";

            Set<Character> set = new HashSet<>();

            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);

                if (set.contains(current)) {
                    break;
                }

                set.add(current);
                temp += current;
            }

            values.set(i, temp);

        }

        int max = 0;

        for (String value : values) {
            if (value.length() > max) {
                max = value.length();
            }
        }

        return max;
    }
}