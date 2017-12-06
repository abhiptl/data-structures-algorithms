package Algorithms.Searching.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IcecreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[][] result = new int[t][];

        for(int i = 1; i <= t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int[] ci = new int[n];
            result[i-1] = new int[2];
            Map<Integer, Integer> hashMap = new HashMap<>();

            Integer remaining;
            for(int j = 0; j < n; j++) {
                ci[j] = scanner.nextInt();

                remaining = m - ci[j];

                if(hashMap.containsKey(remaining)) {
                    result[i-1][0] = hashMap.get(remaining);
                    result[i-1][1] = j +1;
                }

                hashMap.put(ci[j], (j+1));
            }


        }

        for(int c = 0; c < t; c++) {
            for(int d = 0; d < 2; d++) {
                System.out.print(result[c][d] + " ");
            }
            System.out.println();
        }
    }
}
