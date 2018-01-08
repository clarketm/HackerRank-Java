package introduction;

import java.util.Scanner;

// Java Output Formatting
// https://www.hackerrank.com/challenges/java-output-formatting/problem

// * The first column contains the String and is left justified using exactly 15 characters.
// * The second column contains the integer, expressed in exactly 3 digits;
//   if the original input has less than three digits, you must pad your output's leading digits with zeroes.

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = in.next();
            int d = in.nextInt();

            System.out.printf("%-14s %03d\n", s, d);
        }
        System.out.println("================================");
    }

}
