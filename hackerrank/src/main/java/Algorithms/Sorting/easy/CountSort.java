package Algorithms.Sorting.easy;

/**
 * https://www.hackerrank.com/challenges/countingsort2/problem
 */
public class CountSort {
    static int[] countingSort(int[] arr) {
        int[] indexed = new int[100];

        for(int i = 0; i< arr.length; i++) {
            indexed[arr[i]] = indexed[arr[i]]+1;
        }

        int k = 0;
        for(int i = 0; i < indexed.length; i++) {
            int count = indexed[i];
            while(count > 0) {
                arr[k++] = i;
                count--;
            }
        }

        return arr;

    }
}
