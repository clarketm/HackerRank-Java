package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-review-loop

public class LetsReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        for (int i = 0; i < n; i++) {
            s = in.next();
            printEvenPrefix(s);

        }
    }

    static void printEvenPrefix(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(s.charAt(i));
            } else {
                odd.append(s.charAt(i));
            }
        }

        System.out.printf("%s %s\n", even.toString(), odd.toString());
    }

}
