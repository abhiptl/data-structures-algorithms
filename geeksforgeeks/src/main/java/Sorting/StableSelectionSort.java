package Sorting;

import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/stable-selection-sort/
 */
public class StableSelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] unsorted = new int[n];

        for(int i = 0; i < n; i++){
            unsorted[i] = in.nextInt();
        }

        stableSelectionSort(unsorted, n);


        for(int i = 0; i < n; i++){
            System.out.println(unsorted[i]);
        }

    }

    public static void stableSelectionSort(int[] unsorted, int n) {
        int minIndexJ;
        for(int i = 0; i < n - 1; i++) {
            minIndexJ = i;
            for(int j = i + 1; j < n; j++) {
                if(unsorted[j] < unsorted[minIndexJ]) {
                    minIndexJ = j;
                }
            }

            int minValue = unsorted[minIndexJ];

            while (minIndexJ > i) {
                unsorted[minIndexJ] = unsorted[minIndexJ-1];
                minIndexJ--;
            }

            unsorted[i] = minValue;

        }

    }


}
