package Algorithms.Implementation.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // Write Your Code Here

        int lastScore = 0;
        int rank_i[] = new int[n];
        int rank = 0;

        for(int i = 0; i< scores.length; i++) {
            if(scores[i] == lastScore) {
                rank_i[i] = rank;
            } else {
                rank_i[i] = ++rank;
            }


            lastScore = scores[i];
        }



            for(int h = 0; h < alice.length; h++) {
                for(int i = 0; i < n; i++) {
                    if(alice[h] == scores[i]) {
                        Integer integer = rank_i[i];
                        System.out.println(integer);
                        break;
                    } else if(alice[h] > scores[i]){
                        if(i == 0) {
                            Integer integer = 1;
                            System.out.println(integer);
                            break;
                        } else {
                            Integer integer = rank_i[i] + 1;
                            System.out.println(integer);
                            break;
                        }

                    } else {
                        if(i == n-1) {
                            Integer integer = rank_i[i] + 1;
                            System.out.println(integer);
                            break;
                        } else if(alice[h] < scores[i+1]) {

                        } else if(alice[h] > scores[i+1]) {
                            Integer integer = rank_i[i+1];
                            System.out.println(integer);
                            break;
                        }
                    }

                }
            }

        in.close();
    }
}
