package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/coin-change

public class CoinChangeProblem {
    private static Map<String, Long> memo = new HashMap<>();

    static long getWays(long amountRemaining, int numCoinToUse, long[] coinDenominations) {

        String cacheKey = (int) amountRemaining + ":" + numCoinToUse;

        if (memo.containsKey(cacheKey)) {
            return memo.get(cacheKey);
        }

        if (amountRemaining == 0)
            return 1;

        if (amountRemaining < 0)
            return 0;

        if (numCoinToUse <= 0)
            return 0;

        long result = getWays(amountRemaining, numCoinToUse - 1, coinDenominations)
                + getWays(amountRemaining - coinDenominations[numCoinToUse - 1], numCoinToUse, coinDenominations);

        memo.put(cacheKey, result);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for (int c_i = 0; c_i < m; c_i++) {
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using numCoins having the values given by 'c'
        long ways = getWays(n, m, c);
        System.out.println(ways);
    }

}

