package leetcode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        double sqrt = Math.sqrt(x);

        return (int) sqrt;
    }

}
