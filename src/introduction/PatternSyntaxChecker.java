package introduction;

        import java.util.Scanner;
        import java.util.regex.Pattern;

// Pattern Syntax Checker
// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

}