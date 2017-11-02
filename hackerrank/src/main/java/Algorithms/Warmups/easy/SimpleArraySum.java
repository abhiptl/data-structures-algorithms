package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class SimpleArraySum {
    public static int simpleArraySum(int n, int[] ar) {
        int sum = 0;

        for(int i = 0; i<ar.length;i++) {
            sum+=ar[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];

        for(int i = 0;i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }

        int sum = simpleArraySum(n, ar);
        System.out.println(sum);
    }
}
