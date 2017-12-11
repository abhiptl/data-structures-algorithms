package Algorithms.Recursion;

import java.util.Scanner;

/**
 * http://www.geeksforgeeks.org/backttracking-set-4-subset-sum/
 */
public class FindSubsetSumProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        boolean[] status = new boolean[n];

        for(int i = 0; i<n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        findSubsetMatchingSum(numbers, n, k, status,0);

    }

    public static void findSubsetMatchingSum(int[] numbers, int n, int k, boolean[] status, int index) {
        int v = k - numbers[index];

        if(v == 0) {
            // print
            status[index] = true;
            for(int i = 0; i< n; i++) {
                if(status[i] == true)
                    System.out.print(numbers[i] + " ");
            }

            return;
        }

        if(v > 0) {
            status[index] = true;
            findSubsetMatchingSum(numbers, n, v, status, index+1);
        } else {
            status[index] = false;
            findSubsetMatchingSum(numbers, n, k, status, index+1);
        }






    }
}
