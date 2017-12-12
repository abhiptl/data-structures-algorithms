package Algorithms.DynamicProgramming.hard;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/coin-change/problem
 */
public class TheCoinChangeProblem {

    HashMap<String, Integer> cache = new HashMap<String, Integer>();

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int coins[] = new int[m];

        for(int i = 0; i< m; i++) {
            coins[i] = scanner.nextInt();
        }

        //int c = minCoinChangeProblem(n, coins);
        int c = numberOfWaysCoinChange(n,m, coins);
        System.out.println(c);


    }

    private static int numberOfWaysCoinChange(int n,int m, int[] coins) {
        // If n is 0 then there is 1 solution (do not include any coin)
        String key = n +"-"+m;
        if (n == 0)
            return 1;

        // If n is less than 0 then no solution exists
        if (n < 0)
            return 0;

        // If there are no coins and n is greater than 0, then no solution exist
        if (m <= 0 && n>=1)
            return 0;

        return numberOfWaysCoinChange(n, m-1, coins) + numberOfWaysCoinChange(n-coins[m-1], m, coins);
        //total(n - v[i], v, i) + total(n, v, i + 1);
    }

    /*private static int minCoinChangeProblem(int S, int[] n) {

        //create a table to store solutions
        int dynamicTable[][] = new int [n.length][S+1];

        //no coins and no sum
        dynamicTable[0][0] = 0;

        // no sum so no coin required
        for(int i = 0;i < n.length; i++) {
            dynamicTable[i][0] = 0;
        }


        for(int  i = 0; i < n.length; i++) {
            for(int j = 1; j < S+1; j++) {
                if(j < n[i]) {
                    if(i == 0) {
                        dynamicTable[i][j] = j;
                    } else {
                        dynamicTable[i][j] = dynamicTable[i-1][j];
                    }
                } else {
                    if(i == 0) {
                        dynamicTable[i][j] = 1+dynamicTable[i][j - n[i]];
                    } else {
                        dynamicTable[i][j] = Math.min(dynamicTable[i-1][j], 1+dynamicTable[i][j - n[i]]);
                    }
                }
            }
        }


        return dynamicTable[n.length - 1][S];
    }*/


}
