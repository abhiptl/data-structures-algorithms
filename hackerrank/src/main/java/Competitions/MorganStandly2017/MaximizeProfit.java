package Competitions.MorganStandly2017;

import java.util.Scanner;

public class MaximizeProfit {
    static int maximizeProfit(int[] a, int[] b, int m, int k) {
        // Complete this function
        int maxDollars = m * k;
        int unitsOfCurrency = 0;
        int unitsOfDollarCurrency = 0;

        for(int i = 0; i < a.length; i++) {
            unitsOfCurrency =  m * b[i];
            unitsOfDollarCurrency = unitsOfCurrency * a[i];

            if(unitsOfDollarCurrency > maxDollars) {
                maxDollars = unitsOfDollarCurrency;
            }
        }

        return maxDollars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[n];
        for(int b_i = 0; b_i < n; b_i++){
            b[b_i] = in.nextInt();
        }
        int result = maximizeProfit(a, b, m, k);
        System.out.println(result);
        in.close();
    }
}
