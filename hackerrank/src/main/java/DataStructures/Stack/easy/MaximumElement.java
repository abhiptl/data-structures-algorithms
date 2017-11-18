package DataStructures.Stack.easy;

import javafx.collections.transformation.SortedList;

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
                stack.pop();
            }

            if(type == 3) {
                Enumeration<BigInteger> elements = stack.elements();
                BigInteger maxElement = null;
                while (elements.hasMoreElements()) {
                    if(maxElement == null) {
                        maxElement = elements.nextElement();
                    } else {
                        BigInteger bigInteger = elements.nextElement();
                        if(bigInteger.compareTo(maxElement) > 0) {
                            maxElement = bigInteger;
                        }
                    }
                }
                list.add(maxElement);

            }
        }

        for(BigInteger b : list) {
            System.out.println(b);
        }
    }
}
