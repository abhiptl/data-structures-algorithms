package Basics.DataStructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */
public class LeapGame1DArray {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n = game.length;
        int i = 0;
        boolean canWin = true;


        boolean moveBackward = false;

        while(i < n) {
            if((i+leap) > n-1) {
                canWin = true;
                break;
            } else if(game[i+1] == 0 && !moveBackward) {
                i = i  + 1;
                continue;
            } else if(game[i+leap] == 0){
                moveBackward = false;
                i = i + leap;
                continue;
            }  else if(i >= 1 && game[i-1] == 0) {
                moveBackward = true;
                i = i  - 1;
                continue;
            } else {
                canWin = false;
                break;
            }
        }

        return canWin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
