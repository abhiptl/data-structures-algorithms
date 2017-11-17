package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Time Complexity : (n*Logn)
 * Algorithm : Divide and Conquer
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        doMergeSort(arr, 0, args.length - 1);

        for(int i = 0; i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    private static void doMergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int middle = low + (high - low)/2;

            doMergeSort(arr, low, middle);
            doMergeSort(arr, middle+1, high);

            mergeParts(arr, low, middle, high);
        }
    }

    private static void mergeParts(int[] arr, int low, int middle, int high) {
        int[] tempArray = new int[arr.length];
        for(int i = low; i < high; i++) {
            tempArray[i] = arr[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (( i <= middle) && (j <= high)) {
            if(tempArray[i] <= tempArray[j]) {
                arr[k] = tempArray[i];
                i++;
            } else {
                arr[k] = tempArray[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            arr[k] = tempArray[i];
            i++;
            k++;
        }
    }
}
