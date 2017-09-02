package solutions.CrackingTheCodingInterview;


public class MakeChange {

    public static void main(String[] args) {
        int amount = 5;
        int[] denoms = new int[]{1, 5, 10, 25, 50};
        int ways = makeChange(amount, denoms, 0);
        System.out.println(ways);
    }

    private static int makeChange(int amount, int[] denoms, int index) {
        // last denom
        if (index >= denoms.length - 1) return 1;

        int denomAmount = denoms[index];
        int ways = 0;

        for (int i = 0; i * denomAmount <= amount; i++) {
            int amountRemaining = amount - i * denomAmount;
            ways += makeChange(amountRemaining, denoms, index + 1);
        }
        return ways;
    }

}