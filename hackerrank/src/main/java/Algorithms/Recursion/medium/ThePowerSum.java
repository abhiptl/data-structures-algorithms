package Algorithms.Recursion.medium;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-power-sum/problem
 */
public class ThePowerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();

        System.out.println(powerSum(X, N, 1));
    }

    public static int powerSum(int X, int N, int num) {
        int v = (int)(X - Math.pow((double) num, N));

        if(v < 0) {
            return 0;
        } else if (v == 0) {
            return 1;
        } else {
            return powerSum(v, N, num+1) + powerSum(X, N, num+1);
        }
    }
}
