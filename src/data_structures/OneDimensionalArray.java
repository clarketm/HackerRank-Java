package data_structures;

import java.util.Scanner;

// Java 1D Array
// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

public class OneDimensionalArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            array[i] = val;
        }

        in.close();

        for (int item : array) {
            System.out.println(item);
        }
    }
}