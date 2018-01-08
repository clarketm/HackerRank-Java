package introduction;

import java.time.LocalDate;
import java.util.Scanner;

// Java Date and Time
// https://www.hackerrank.com/challenges/java-date-and-time/problem

public class DateAndTime {

    public static String getDay(String day, String month, String year) {
        LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return dt.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

}