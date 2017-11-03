package Algorithms.Warmups.easy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];


        for(int i = 0; i< arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        double plusCount = 0;
        double minusCount = 0;
        double zeroCount = 0;

        for(int i = 0; i< arr.length; i++) {
           if(arr[i] == 0) {
               zeroCount++;
           } else if(arr[i] > 0) {
               plusCount++;
           } else {
               minusCount++;
           }
        }

        double plusFraction = plusCount / n;
        double minusFraction = minusCount / n;
        double zeroFraction = zeroCount / n;


        NumberFormat format = new DecimalFormat("#.######"); // 1.121212
        System.out.println(format.format(plusFraction));
        System.out.println(format.format(minusFraction));
        System.out.println(format.format(zeroFraction));


    }
}
