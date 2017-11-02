package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = scanner.nextInt();

       for(int i = 1; i <= n; i++) {
           for(int j = 1; j <= n; j++) {
               if(i > n-j) {
                   System.out.printf("#");
               } else {
                   System.out.printf(" ");
               }

           }
           System.out.println("");
       }
    }
}
