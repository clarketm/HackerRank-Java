package solutions.CrackingTheCodingInterview;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-lonely-integer

public class LonelyInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= in.nextInt();
        }

        System.out.println(result);
    }

}
