package Algorithms.Implementation.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        int totalCost = 0;
        int excludingTotalCost = 0;
        for(int i = 0; i< n ;i++) {
            totalCost +=ar[i];

            if(i != k) {
                excludingTotalCost += ar[i];
            }
        }

        int expectedContribution = excludingTotalCost/2;

        if(b == expectedContribution) {
            return 0;
        } else {
            return b - expectedContribution;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result == 0) {
            System.out.printf("Bon Appetit");
        } else {
            System.out.println(result);
        }

    }
}
