package Algorithms.Sorting.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro/problem
 */
public class IntroToTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0;i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0;i < n; i++) {
            if(numbers[i] == v) {
                System.out.println(i);
                break;
            }
        }
    }
}
