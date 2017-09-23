package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-binary-numbers/problem

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // verbose
//        String bin = convertDecimalToBinary(n);
//        int ones = consecutiveOnes(bin);
//        System.out.println(ones);

        // bitwise
        int ones = consecutiveOnes(n);
        System.out.println(ones);
    }


    static String convertDecimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    // verbose
    static int consecutiveOnes(String bin) {
        int max = 0, ones = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                ones++;
                max = ones > max ? ones : max;
            } else {
                ones = 0;
            }
        }
        return max;
    }

    // bitwise
    static int consecutiveOnes(int n) {
        int max = 0, ones = 0;

        while (n > 0) {
            ones = (n & 1) == 1 ? ++ones : 0;
            max = ones > max ? ones : max;
            n >>= 1;
        }
        return max;
    }

}
