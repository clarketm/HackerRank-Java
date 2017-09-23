package algorithms.ThirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/grid-challenge/problem

public class Grid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            char[][] grid = new char[N][N];

            for (int row = 0; row < N; row++) {
                String charSeq = in.next();
                for (int col = 0; col < charSeq.length(); col++) {
                    grid[row][col] = charSeq.charAt(col);
                }
            }

            System.out.println(isSortable(grid) ? "YES" : "NO");
        }
    }

    private static boolean isSortable(char[][] grid) {
        int rows = grid.length;
        int cols = grid.length; // symmetric

        // sort `rows`
        for (int row = 0; row < rows; row++) {
            Arrays.sort(grid[row]);
        }

        // check `cols`
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] > grid[row + 1][col]) {
                    return false;
                }
            }
        }
        return true;
    }

}
