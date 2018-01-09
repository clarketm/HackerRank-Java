package introduction;

import java.util.Scanner;

// Java Regex
// https://www.hackerrank.com/challenges/java-regex/problem

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}

class MyRegex {
    public String pattern;

    MyRegex() {
        this.pattern = "([0-1]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])\\.([0-1]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])";
    }

}