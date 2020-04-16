package Basics.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class ArrayListQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList[] listArry = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            int d = in.nextInt();
            listArry[i] = new ArrayList();
            for(int j = 1; j <= d; j++) {
                listArry[i].add(in.nextInt());
            }
        }

        int q = in.nextInt();
        for(int k=1;k<=q;k++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(listArry[x-1].get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

        }
    }
}
