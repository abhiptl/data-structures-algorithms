package Algorithms.Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * First search range using exponential position and then do binary search
 *
 * Worst Time complexity : O(log(n))
 */
public class ExponentialSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int searchNumber = scanner.nextInt();
        for(int i = 0;i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(exponentialSearch(arr, searchNumber));
    }

    public static int exponentialSearch(int[] arr, int searchNumber) {
        int n = arr.length;

        if (arr[0] == searchNumber)
            return 0;


        int i = 1;
        while (i < arr.length && arr[i] <= searchNumber)
            i = i*2;

        return Arrays.binarySearch(arr, i/2, Math.min(i, n), searchNumber);
    }


}
