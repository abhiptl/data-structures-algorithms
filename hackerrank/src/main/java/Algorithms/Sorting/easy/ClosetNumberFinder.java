package Algorithms.Sorting.easy;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/closest-numbers/problem
 *
 */
public class ClosetNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

    static int[] closestNumbers(int[] arr) {
        // Complete this function
        List<Integer> difference = new ArrayList<Integer>();
        difference.add(Integer.MAX_VALUE);

        List<Integer> numbers = new ArrayList<>();
        List<Integer> finalClosetNumberPairs = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }

        Collections.sort(numbers);

        for(int i = 1; i < numbers.size(); i++) {
            difference.add(numbers.get(i) - numbers.get(i-1));
        }

        Integer smallest = Integer.MAX_VALUE;
        for(Integer diff : difference) {
            if(diff < smallest) {
                smallest = diff;
            }
        }

        for(int i = 0; i < difference.size(); i++) {
            if(difference.get(i).intValue() == smallest.intValue()) {
                finalClosetNumberPairs.add(numbers.get(i-1));
                finalClosetNumberPairs.add(numbers.get(i));}
        }

        return finalClosetNumberPairs.stream().mapToInt(Integer::intValue).toArray();
    }

}
