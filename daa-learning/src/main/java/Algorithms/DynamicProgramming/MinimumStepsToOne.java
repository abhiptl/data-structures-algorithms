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
        System.out.println(topDownGetMinSteps(n, memoization));
        //System.out.println(bottomDownGetMinSteps(n, memoization));
    }

    // Top Down Approach
    public static int topDownGetMinSteps(int n, int[] memoization) {
        if (n == 1)
            return 0;  // base case

        if (memoization[n] != -1)
            return memoization[n];  // we have already solved it so return the resul

        int r = 1 + topDownGetMinSteps(n - 1, memoization); // Operation 1 : Subtract 1 from it

        if (n % 2 == 0)
            r = min(r, 1 + topDownGetMinSteps(n / 2, memoization)); // Operation 2 : If it is divisible by 2 then divide it by 2

        if (n % 3 == 0)
            r = min(r, 1 + topDownGetMinSteps(n / 3, memoization)); // Operation 3 : If it is divisible by 3 then divide it by 3


        memoization[n] = r;  // save(memoize) result

        return r;

    }

    // Bottom up Approach
    public static int bottomDownGetMinSteps(int n, int[] memoization) {
        memoization[1] = 0;  // trivial case

        for(int i = 2 ; i <= n ; i ++ ) {

            memoization[i] = 1 + memoization[i-1];

            if(i%2 == 0) {
                memoization[i] = min( memoization[i] , 1+ memoization[i/2] );
            }

            if( i%3 == 0) {
                memoization[i] = min( memoization[i] , 1+ memoization[i/3] );
            }

        }

        return memoization[n];
    }


    public static int min(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }


}
