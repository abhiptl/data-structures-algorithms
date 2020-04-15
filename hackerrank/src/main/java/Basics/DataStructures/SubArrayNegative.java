package Basics.DataStructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */
public class SubArrayNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(isSumNegative(num, i, j)) {
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isSumNegative(int[] num, int i, int j) {
        int sum = 0;
        for(int m = i; m <= j; m++) {
            sum += num[m];
        }

        if(sum < 0) {
            return true;
        } else {
            return false;
        }
    }
}
