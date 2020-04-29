package DataStructures.Stack.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/largest-rectangle/problem
 */
public class LargestRectangle {
    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {

        int n = h.length;
        long res = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = h[i];
            int k = 1;
            for (int j = i + 1; j < n; j++) {
                if(h[j] >= min) {
                    k++;
                    res = Math.max(res, (k*min));
                } else {
                    k++;
                    min = h[j];
                    res = Math.max(res, (k*min));
                }
            }
        }

        return res;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);
        System.out.println(result);


        scanner.close();
    }
}
