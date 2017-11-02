package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int maxHeight = 0;
        int maxHeightCount = 0;

        for(int i = 0; i< n; i++) {
            if(ar[i] >= maxHeight) {
                if(maxHeight == ar[i]) {
                    maxHeightCount++; // increment max count when same number found
                } else {
                    maxHeightCount = 1; // reset counter when new max found
                }
                maxHeight = ar[i];
            }
        }

        return maxHeightCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
