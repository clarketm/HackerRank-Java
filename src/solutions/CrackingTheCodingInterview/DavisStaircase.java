package solutions.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

public class DavisStaircase {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            int ways = countWays(n);
            System.out.println(ways);
        }
    }

    private static int countWays(int numStairs) {
        if (memo.containsKey(numStairs)) {
            return memo.get(numStairs);
        }
        if (numStairs < 0) {
            return 0;
        }
        if (numStairs == 0) {
            return 1;
        }

        int ways = countWays(numStairs - 1) + countWays(numStairs - 2) + countWays(numStairs - 3);
        memo.put(numStairs, ways);

        return ways;
    }

}
