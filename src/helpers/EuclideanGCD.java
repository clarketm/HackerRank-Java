package helpers;

public class EuclideanGCD {
    private int max;
    private int min;

    public EuclideanGCD(int a, int b) {
        max = a > b ? a : b;
        min = a > b ? b : a;
    }

    public int getGCD() {
        return computeGCD(max, min);
    }

    private int computeGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return computeGCD(b, a % b);
    }

    public static void main(String[] args) {
        EuclideanGCD gcd1 = new EuclideanGCD(270, 192);
        System.out.println(gcd1.getGCD()); // 6

        EuclideanGCD gcd2 = new EuclideanGCD(3, 9);
        System.out.println(gcd2.getGCD()); // 3
    }

}
