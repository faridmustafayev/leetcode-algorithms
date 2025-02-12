package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lastWord = new LengthOfLastWord();
        int i = lastWord.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(i);
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
        }

        return s.length();
    }

}
