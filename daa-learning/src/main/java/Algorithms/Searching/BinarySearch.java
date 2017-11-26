package Algorithms.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int searchNumber = scanner.nextInt();
        for(int i = 0;i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int searchIndex = binarySearch(arr, 0, n-1, searchNumber);
        System.out.println(searchIndex);
    }

    public static int binarySearch(int[] arr, int low, int high, int searchNumber) {
        while (high >= low) {
            int middle = low + (high - low)/2;
            if(arr[middle] == searchNumber) {
                return middle;
            }

            if(arr[middle] > searchNumber) {
                return binarySearch(arr, low, middle - 1,searchNumber);
            } else {
                return binarySearch(arr, middle+1, high,searchNumber);
            }
        }

        return -1;

    }
}
