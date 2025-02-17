package leetcode;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.10000, 3));
    }

    public static double myPow(double x, int n) {
        double value = Math.pow(x, n);
        String s = String.format("%.5f", value);

        String[] split = s.split("\\.");
        String s1 = split[0];
        String s2 = split[1];

        if (s2.length() > 5) {
            s2 = s2.substring(0, 5);
        } else {
            while (s2.length() < 5) {
                s2 += "0";
            }
        }

        s1 += "." + s2;

        return Double.parseDouble(s1);
    }
}
