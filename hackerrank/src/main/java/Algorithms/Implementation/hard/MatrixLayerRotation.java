package Algorithms.Implementation.hard;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
 */
public class MatrixLayerRotation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        int[][] data = new int[m][];
        int[][] temp = new int[m][];
        for (int i = 0; i < m; i++) {
            data[i] = new int[n];
            temp[i] = new int[n];
            for (int j = 0; j < n; j++) {
                data[i][j] = scanner.nextInt();
                //temp[i][j] = data[i][j];
            }
        }

        int row = m;
        int col = n;

        int startX = 0;
        int startY = 0;

        for (int ro = 1; ro <= r; ro++) {

            if(ro > 1) {

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        data[i][j] = temp[i][j];

                    }
                }

                row = m;
                col = n;

                startX = 0;
                startY = 0;
            }


            while (row != 0 && col != 0) {

                for (int i = startX; i < row; i++) {
                    for (int j = startY; j < col; j++) {

                        if (i == startX) {
                            if (j == startY) {
                                // i++, j
                                temp[i + 1][j] = data[i][j];
                            } else {
                                // i,j--
                                temp[i][j - 1] = data[i][j];
                            }
                        } else if (i == row - 1) {
                            if (j == col - 1) {
                                // i--, j
                                temp[i - 1][j] = data[i][j];
                            } else {
                                // i, j++
                                temp[i][j + 1] = data[i][j];
                            }
                        } else {
                            if (j == startY) {
                                // i++,j
                                temp[i + 1][j] = data[i][j];
                            } else if (j == col - 1) {
                                // i--,j
                                temp[i - 1][j] = data[i][j];
                            } else {
                                temp[i][j] = data[i][j];
                            }
                        }

                    }
                }

                row -= 1;
                col -= 1;
                startX++;
                startY++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

        long end = System.currentTimeMillis();
        double seconds = (end - start) / 1000.0;
        System.out.println(seconds + " Sec");
    }
}
