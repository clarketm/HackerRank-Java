package solutions;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-operators

public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tipCost = mealCost * ((double) tipPercent / 100);
        double taxCost = mealCost * ((double) taxPercent / 100);
        double result = mealCost + tipCost + taxCost;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(result);

        // Print your result
        System.out.printf("The total meal cost is %d dollars.", totalCost);
    }

}
