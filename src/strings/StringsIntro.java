package strings;

// Java Strings Introduction
// https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.Scanner;

public class StringsIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();
        String AgtB = Integer.parseInt(A) > Integer.parseInt(B) ? "Yes" : "NO";
        String concatTitle = A.charAt(0) + A.substring(1) + " " + B.charAt(0) + B.substring(1);

        System.out.println(sum);
        System.out.println(AgtB);
        System.out.println(concatTitle);

    }

}
