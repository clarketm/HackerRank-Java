package data_structures;

import java.util.Scanner;

// Java 2D Array
// https://www.hackerrank.com/challenges/java-2d-array/problem

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE, sum;

        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
                if (i >= 2 && j >= 2) {
                    sum = arr[i - 2][j - 2] + arr[i - 2][j - 1] + arr[i - 2][j] + arr[i - 1][j - 1] + arr[i][j - 2] + arr[i][j - 1] + arr[i][j];
                    if (sum > max)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }

}