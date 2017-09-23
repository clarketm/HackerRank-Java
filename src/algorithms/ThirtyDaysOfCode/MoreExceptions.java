package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// Day 17: More Exceptions
// https://www.hackerrank.com/challenges/30-more-exceptions/problem

public class MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

    private static class Calculator {

        private int power(double n, double p) throws NumberFormatException {
            if (n < 0 || p < 0) {
                throw new NumberFormatException("n and p should be non-negative");
            }
            return (int) Math.pow(n, p);
        }
    }
}
