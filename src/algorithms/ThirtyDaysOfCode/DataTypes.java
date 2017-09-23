package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-data-types

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner in = new Scanner(System.in);

        int i1 = Integer.parseInt(in.nextLine());
        double d1 = Double.parseDouble(in.nextLine());
        String s1 = in.nextLine();

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);

        in.close();
    }

}