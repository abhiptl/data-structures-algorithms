package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort4/problem
 */
public class FullCountingSort {
    static void countSort(List<List<String>> arr) {
        int inputSize = arr.size();

        List<List<String>> result = new ArrayList<>(100);
        for(int i = 1; i<=100; i++) {
            result.add(new ArrayList<String>());
        }

        for(int i = 0; i < inputSize; i++) {
            List<String> inputRow = arr.get(i);

            int index = Integer.parseInt(inputRow.get(0));
            String data = inputRow.get(1);


            if((i+1) > inputSize/2)  {
                result.get(index).add(data);
            } else {
                result.get(index).add("-");
            }
        }

        for(List<String> output : result) {
            if(!output.isEmpty()) {
                for(String s : output) {
                    System.out.print(s+" ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = in.nextInt();
            String data = in.next();
            List<String> input = new ArrayList<>();
            input.add(String.valueOf(index));
            input.add(data);

            arr.add(input);
        }

        countSort(arr);
    }
}
