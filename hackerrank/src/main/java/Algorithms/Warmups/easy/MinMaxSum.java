package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int minNum = arr[0];
        int maxNum = 0;

        long sum = 0; // 64 bit integer means use long.

        // find minimum and maximum number of n
        for(int i = 0; i< arr.length ;i++) {
            if(arr[i] >= maxNum) {
                maxNum = arr[i];
            }

            if(arr[i] < minNum) {
                minNum = arr[i];
            }

            sum+=arr[i]; // sum all n
        }


        long minSum = sum - maxNum;// to get maximum sum, substract min number from overall sum
        long maxSum = sum - minNum;// to get minimum sum, substract max number from overall sum

        System.out.printf(minSum+" "+maxSum);
    }
}
