package Algorithms.Searching;

import java.util.Scanner;

/**
 * Better than Binary search when elements are uniformly distributed
 *
 * if elements are uniformly distributed then O(log logn).
 * Worst case : O(log(log(n)))
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int searchNumber = scanner.nextInt();
        for(int i = 0;i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int searchIndex = interpolationSearch(searchNumber, arr);
        System.out.println(searchIndex);
    }

    static int interpolationSearch(int x, int arr[])
    {
        // Find indexes of two corners
        int lo = 0, hi = (arr.length - 1);

        // Since array is sorted, an element present
        // in array must be in range defined by corner
        while (lo <= hi && x >= arr[lo] && x <= arr[hi])
        {
            // Probing the position with keeping
            // uniform distribution in mind.
            int pos = lo + (((hi-lo) /
                    (arr[hi]-arr[lo]))*(x - arr[lo]));

            // Condition of target found
            if (arr[pos] == x)
                return pos;

            // If x is larger, x is in upper part
            if (arr[pos] < x)
                lo = pos + 1;

                // If x is smaller, x is in lower part
            else
                hi = pos - 1;
        }
        return -1;
    }
}
