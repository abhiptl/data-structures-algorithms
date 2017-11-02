package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int element = 0;
        int[][] diagonalMatrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            diagonalMatrix[i] = new int[n];
            for(int j = 0; j < n; j++) {
                element = scanner.nextInt();
                diagonalMatrix[i][j] = element;
            }
        }


        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for(int i = 0; i< n; i++) {
            for(int j = 0; j< n; j++) {
                if(i == j) {
                    leftDiagonalSum += diagonalMatrix[i][j];
                }

                if(i+j == n-1) {
                    rightDiagonalSum += diagonalMatrix[i][j];
                }
            }
        }


        int difference = rightDiagonalSum - leftDiagonalSum;
        System.out.println(Math.abs(difference));
    }
}
