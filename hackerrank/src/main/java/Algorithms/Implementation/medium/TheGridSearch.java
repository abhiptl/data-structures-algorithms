package Algorithms.Implementation.medium;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-grid-search/problem
 */
public class TheGridSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        int rowG, colG, rowP, colP;
        char[][] gridG, gridP;
        String[] result = new String[testCases];
        for(int i = 1; i <= testCases; i++) {
            rowG = scanner.nextInt();
            colG = scanner.nextInt();

            gridG = new char[rowG][colG];

            for(int j = 0; j < rowG; j++) {
                String lineG = scanner.next();
                gridG[j] = lineG.toCharArray();
            }

            rowP = scanner.nextInt();
            colP = scanner.nextInt();

            gridP = new char[rowP][colP];

            for(int j = 0; j < rowP; j++) {
                String lineP = scanner.next();
                gridP[j] = lineP.toCharArray();
            }

            int maxRowToCheck = rowG - rowP;
            int maxColToCheck = colG - colP;

            boolean status = false;
            for(int m = 0; m <= maxRowToCheck; m++) {
                for(int n = 0; n <= maxColToCheck; n++) {
                    if(gridG[m][n] == gridP[0][0]) {
                        if(checkSameArray(gridG, m, n, gridP, rowP, colP)) {
                            status = true;
                            break;
                        }

                    }
                }
            }

            if(status) {
                result[i-1] = "YES";
            } else {

                result[i-1] = "NO";
            }


        }

        for(String s : result) {
            System.out.println(s);
        }

    }

    static boolean checkSameArray(char[][] parent, int pi , int pj, char[][] child, int ci, int cj) {
        boolean found = true;

        int c = 0;
        int v = 0;
        for(int i = pi; i < pi + ci; i++) {
            v = 0;
            for(int j = pj; j < pj + cj; j++) {
                  if(parent[i][j] != child[c][v++]) {
                      found = false;
                      break;
                  }
            }

            if(!found) {
                break;
            } else {
                c++;
            }

        }

        return found;
    }
}

/**
 *
 *
 * 1
 4 6
 123456
 567890
 234567
 194729
 4 4
 1234
 5678
 2345
 4729
 NO




 */
