package algorithms;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/2d-array

public class Hourglass {
    public static final int MATRIX_SIZE = 6;

    private int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hourglass hg = new Hourglass();

        for (int r = 0; r < MATRIX_SIZE; r++) {
            for (int c = 0; c < MATRIX_SIZE; c++) {
                hg.matrix[r][c] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE, sum;
        for (int r = 0; r < MATRIX_SIZE - 2; r++) {
            for (int c = 0; c < MATRIX_SIZE - 2; c++) {
                sum = hg.calculateSum(r, c);
                max = sum > max ? sum : max;
            }
        }

        System.out.println(max);
    }

    public int calculateSum(int r, int c) {
        int top = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2];
        int middle = matrix[r + 1][c + 1];
        int bottom = matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];
        return top + middle + bottom;
    }

}
