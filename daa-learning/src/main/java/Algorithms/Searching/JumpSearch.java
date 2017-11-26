package Algorithms.Searching;

import java.util.Scanner;

/**
 * Jump search on sorted elements
 *
 * Better than linear search
 * Optimal size of block m = Sqrt of N
 * Time complexity is between linear(o(n) and binary search(o(long n))
 */
public class JumpSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int searchNumber = scanner.nextInt();
        for(int i = 0;i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = (int) Math.sqrt(n);

        int low = 0;
        int high = n -1;
        int k = 0;

        while (k*m <= high) {
            if(arr[k*m] <= searchNumber && searchNumber <= arr[(k+1)*m]) {
                break;
            }
            k++;
        }

        for( int j = k*m; j <= (k+1)*m; j++) {
            if(arr[j] == searchNumber) {
                System.out.println(j);
                return;
            }
        }

        System.out.println("Element not found");
    }


}
