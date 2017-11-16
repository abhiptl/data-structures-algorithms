package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] unsorted = new int[n];

        for(int i = 0; i < n; i++){
            unsorted[i] = in.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(unsorted[j] > unsorted[j+1]) {
                    swapNumbers(unsorted, j ,j+1);
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(unsorted[i]);
        }

    }

    public static void swapNumbers(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
