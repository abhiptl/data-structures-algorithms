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
        List<BigInteger> list = new ArrayList<>();

        for(int i = 1; i<=n; i++) {
            type = scanner.nextInt();

            if(type == 1) {
                newElement = scanner.nextBigInteger();
                stack.push(newElement);

            }

            if(type == 2) {
                BigInteger pop = stack.pop();
            }

            if(type == 3) {
                Optional<BigInteger> max = stack.stream().max(BigInteger::compareTo);
                list.add(max.get());
            }
        }

        for(BigInteger b : list) {
            System.out.println(b);
        }
    }
}
