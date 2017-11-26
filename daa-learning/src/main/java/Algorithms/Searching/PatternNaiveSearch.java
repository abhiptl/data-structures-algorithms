package Algorithms.Searching;

import java.util.Scanner;

/**
 * Best Case : O(n)
 * Worst Case : O(m*(n-m+1)
 */
public class PatternNaiveSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text :");
        String text = scanner.nextLine();
        System.out.println("Enter pattern :");
        String pattern = scanner.nextLine();
        search(text, pattern);
    }

    public static void search(String text, String pattern) {
        int M = pattern.length();
        int N = text.length();


        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;

            if (j == M) //
                System.out.println("Pattern found at index " + i);
        }
    }
}
