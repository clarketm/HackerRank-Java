package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Java Currency Formatter
// https://www.hackerrank.com/challenges/java-currency-formatter/problem

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        in.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Write your code here.

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }

}