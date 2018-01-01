package Algorithms.DynamicProgramming;

import java.util.Scanner;

public class FibonacciDP {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] memoization = new int[n];

        for(int i = 0; i < n; i++) {
            memoization[i] = -1; // -1 means not solved yet
        }
        System.out.println(fibonacci(n, memoization));

    }

    public static int fibonacci(int n, int[] memoization)  {
        memoization[0] = 1;
        memoization[1] = 1;
        for (int i = 2; i<n; i++) {
            memoization[i] = memoization[i-1] + memoization[i-2];
        }

        return memoization[n-1];

    }



}
