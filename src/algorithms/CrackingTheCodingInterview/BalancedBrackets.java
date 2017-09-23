package algorithms.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-balanced-brackets

public class BalancedBrackets {
    private static Map<Character, Character> matches = new HashMap<>();

    public static void main(String[] args) {
        matches.put('{', '}');
        matches.put('(', ')');
        matches.put('[', ']');

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(matches.get(ch));
                    isBalanced = false;
                    break;
                case '}':
                case ')':
                case ']':
                    if (stack.empty() || stack.pop() != ch) {
                        return false;
                    }
                    isBalanced = true;
                    break;
            }
        }
        return isBalanced;
    }

}
