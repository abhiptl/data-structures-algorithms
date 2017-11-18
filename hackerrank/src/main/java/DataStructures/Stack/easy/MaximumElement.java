package DataStructures.Stack.easy;

import java.math.BigInteger;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/maximum-element/problem
 */
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int type;
        BigInteger newElement;
        Stack<BigInteger> stack = new Stack<>();
        Stack<BigInteger> maxStack = new Stack<>();

        for(int i = 1; i<=n; i++) {
            type = scanner.nextInt();

            if(type == 1) {
                newElement = scanner.nextBigInteger();
                stack.push(newElement);

                if(maxStack.isEmpty() || maxStack.peek().compareTo(newElement) < 0) {
                    maxStack.push(newElement);
                }

            }

            if(type == 2) {
                BigInteger pop = stack.pop();
                if(pop.compareTo(maxStack.peek()) == 0) {
                    maxStack.pop();
                }
            }

            if(type == 3) {
                System.out.println(maxStack.peek());
            }
        }


    }
}
