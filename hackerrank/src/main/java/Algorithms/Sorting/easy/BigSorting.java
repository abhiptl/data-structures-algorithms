package Algorithms.Sorting.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        BigInteger[] unsortedInt = new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
            unsortedInt[unsorted_i] = new BigInteger(unsorted[unsorted_i]);
        }

        for(int i = 0; i < unsortedInt.length; i++) {
            for(int j = i+1; j < unsortedInt.length; j++) {

                if(unsortedInt[j].compareTo(unsortedInt[i]) == -1) {
                    swapNumbers(i ,j, unsortedInt);
                }
            }
        }

        for(int i = 0;i < n; i++) {
            System.out.println(unsortedInt[i]);
        }
    }

    private static void swapNumbers(int i, int j, BigInteger[] array) {
        BigInteger temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
