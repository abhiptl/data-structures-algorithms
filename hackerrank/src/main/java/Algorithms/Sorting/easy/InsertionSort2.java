package Algorithms.Sorting.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort2/problem
 */
public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
    }

    static void insertionSort2(int n, int[] arr) {
        for(int j=1; j<n;j++) {
            int key = arr[j];
            int i = j-1;
            while (i>=0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i--;


            }
            arr[i+1] = key;
            print(arr,n);

        }
    }

    static void print(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}
