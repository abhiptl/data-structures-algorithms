package Algorithms.DynamicProgramming;

import java.util.Scanner;

public class MinimumStepsToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] memoization = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            memoization[i] = -1; // -1 means not solved yet
        }
        System.out.println(getMinSteps(n, memoization));
    }

    public static int getMinSteps(int n, int[] memoization) {
        if (n == 1)
            return 0;  // base case

        if (memoization[n] != -1)
            return memoization[n];  // we have already solved it so return the resul

        int r = 1 + getMinSteps(n - 1, memoization); // Operation 1 : Subtract 1 from it

        if (n % 2 == 0)
            r = min(r, 1 + getMinSteps(n / 2, memoization)); // Operation 2 : If it is divisible by 2 then divide it by 2

        if (n % 3 == 0)
            r = min(r, 1 + getMinSteps(n / 3, memoization)); // Operation 3 : If it is divisible by 3 then divide it by 3


        memoization[n] = r;  // save(memoize) result

        return r;

    }

    public static int min(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }
}
