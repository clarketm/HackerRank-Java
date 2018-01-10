package data_structures;

import java.util.Scanner;

// Java Subarray
// https://www.hackerrank.com/challenges/java-negative-subarray/problem

public class Subarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int negativeSubarrays = 0;

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int indexTotal = 0;

            for (int j = i; j < array.length; j++) {
                indexTotal += array[j];

                if (indexTotal < 0) {
                    negativeSubarrays++;
                }
            }
        }

        System.out.println(negativeSubarrays);
    }

}