package Algorithms.Recursion.medium;

import java.util.Scanner;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int k = scanner.nextInt();

        long sum = 0;

        for(int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }

        long l = sum * k;

        String p = Long.toString(l);

        System.out.println(recursiveSum(p));

    }

    public static long recursiveSum(String p) {
        if(p.length() == 1) {
            return Character.getNumericValue(p.charAt(0));
        }
        int len = p.length();
        return recursiveSum(String.valueOf(recursiveSum(p.substring(0,1)) + recursiveSum(p.substring(1, len))));
    }
}
