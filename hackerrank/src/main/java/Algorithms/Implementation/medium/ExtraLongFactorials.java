package Algorithms.Implementation.medium;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        System.out.println(factorial(n));

    }

    public static BigInteger factorial(BigInteger n) {

        if(n.intValue() == 0) {
            return new BigInteger("0");
        }

        if(n.intValue() == 1) {
            return new BigInteger("1");
        }

        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
