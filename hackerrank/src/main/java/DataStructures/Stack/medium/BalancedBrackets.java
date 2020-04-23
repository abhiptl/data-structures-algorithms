package DataStructures.Stack.medium;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        if (s != null && s != "") {
            Stack<Character> brackets = new Stack<>();

            for (Character c : s.toCharArray()) {

                if (brackets.isEmpty()) {
                    brackets.push(c);
                    continue;
                }

                if (c.charValue() == '{' || c.charValue() == '[' || c.charValue() == '(') {
                    brackets.push(c.charValue());
                } else if (c.charValue() == '}' && brackets.peek().charValue() == '{') {
                    brackets.pop();
                } else if (c.charValue() == ']' && brackets.peek().charValue() == '[') {
                    brackets.pop();
                } else if (c.charValue() == ')' && brackets.peek().charValue() == '(') {
                    brackets.pop();
                } else {
                    brackets.push(c);
                }

            }

            return brackets.isEmpty() ? "YES" : "NO";
        } else {
            return "NO";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            System.out.println(isBalanced(s));
        }

    }
}
