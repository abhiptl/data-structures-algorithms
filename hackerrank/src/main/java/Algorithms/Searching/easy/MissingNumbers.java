package Algorithms.Searching.easy;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {

    }

    static int[] missingNumbers(int[] arr, int[] brr) {
        int[] data = new int[100001];

        for(int i=0; i<brr.length; i++) {
            data[brr[i]] = data[brr[i]] + 1;
        }

        for(int i=0; i<arr.length; i++) {
            data[arr[i]] = data[arr[i]] - 1;
        }

        List<Integer> finalList = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            if(data[i] != 0) {
                finalList.add(i);
            }
        }

        return finalList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
