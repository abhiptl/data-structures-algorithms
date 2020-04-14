package Basics.BigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-biginteger/problem
 */
public class BigIntegerArithmatic {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        sc.close();

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
