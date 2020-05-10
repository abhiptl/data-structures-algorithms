package Algorithms.Sorting.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort1/problem
 */
public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
    }

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int key = arr[n-1];
        int i = n-2;

        while(i>=0 && arr[i] > key) {
            arr[i+1] = arr[i];
            i--;

            print(arr,n);
            System.out.println("");
        }

        //change
        arr[i+1] = key;

        print(arr,n);
    }

    static void print(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
