package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

// Day 19: Interfaces
// https://www.hackerrank.com/challenges/30-interfaces/problem

interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }

    private static class Calculator implements AdvancedArithmetic {
        @Override
        public int divisorSum(int num) {
            int divisor = num;
            int sum = 0;

            while (divisor > 0) {
                if (num % divisor == 0) {
                    sum += divisor;
                }
                divisor--;
            }

            return sum;
        }
    }
}
