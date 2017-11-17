package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Time Complexity : o(n2)
 *
 * This will swamp elements at max n times so useful when memory write is costly.
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] unsorted = new int[n];

        for(int i = 0; i < n; i++){
            unsorted[i] = in.nextInt();
        }

        selectionSort(unsorted, n);


        for(int i = 0; i < n; i++){
            System.out.println(unsorted[i]);
        }

    }

    public static void selectionSort(int[] unsorted, int n) {
        int minIndexJ;
        for(int i = 0; i < n - 1; i++) {
            minIndexJ = i;
            for(int j = i + 1; j < n; j++) {
               if(unsorted[j] < unsorted[minIndexJ]) {
                   minIndexJ = j;
               }
            }

            swapNumbers(unsorted, i, minIndexJ);
        }

    }

    public static void swapNumbers(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
