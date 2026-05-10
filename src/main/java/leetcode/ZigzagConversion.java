package leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {

        ZigzagConv zigzagConv = new ZigzagConv();
        System.out.println(zigzagConv.convert("PAYPALISHIRING", 4));

    }
}

class ZigzagConv {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String result = "";
        int cycle = numRows * 2 - 2;

        for (int row = 0; row < numRows; row++) {
            for (int i = row; i < s.length(); i += cycle) {
                result += s.charAt(i);

                int diagonal = i + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 && diagonal < s.length()) {
                    result += s.charAt(diagonal);
                }
            }
        }

        return result;
    }
}
