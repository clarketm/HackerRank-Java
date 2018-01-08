package introduction;

import java.util.Scanner;

// Java Datatypes
// https://www.hackerrank.com/challenges/java-datatypes/problem

public class DataTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long n = in.nextLong();

                System.out.printf("%d can be fitted in:\n", n);
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) System.out.println("* int");
                System.out.println("* long");

            } catch (Exception e) {
                System.out.printf("%s can't be fitted anywhere.\n", in.next());
            }
        }
    }

}
