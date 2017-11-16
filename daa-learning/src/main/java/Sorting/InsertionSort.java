package Sorting;

import java.util.Scanner;

/**
 * Time Complexity : o(n2)
 * 
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] unsorted = new int[n];

        for(int i = 0; i < n; i++){
            unsorted[i] = in.nextInt();
        }

        insertionSort(unsorted, n);


        for(int i = 0; i < n; i++){
            System.out.println(unsorted[i]);
        }

    }

    public static void insertionSort(int[] unsorted, int n) {
        int key,j;
        for(int i = 1; i < n - 1; i++) {
            key = unsorted[i];
            j = i-1;
            while(j>=0 && unsorted[j] > key) {
                unsorted[j+1] = unsorted[j];
                j--;
            }
            unsorted[j+1] = key;
        }

    }
}
