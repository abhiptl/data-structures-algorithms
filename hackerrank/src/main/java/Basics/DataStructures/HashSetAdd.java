package Basics.DataStructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/java-hashset/problem
 */
public class HashSetAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> data = new HashSet<>();

        for(int i=0; i< t; i++) {
            data.add(pair_left[i] + " "+pair_right[i]);
            System.out.println(data.size());
        }
    }
}


