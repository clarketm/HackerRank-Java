package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convertStringToInteger(S);
    }

    static void convertStringToInteger(String str) {
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

}
