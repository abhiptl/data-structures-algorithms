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

        //bubbleSort(n, unsortedInt);
        quickSort(unsortedInt, 0, unsortedInt.length - 1);

        for(int i = 0;i < n; i++) {
            System.out.println(unsortedInt[i]);
        }

    }

    private static void bubbleSort(int n , BigInteger[] unsortedInt) {
        for(int i = 0; i < unsortedInt.length; i++) {
            for(int j = i+1; j < unsortedInt.length; j++) {

                if(unsortedInt[j].compareTo(unsortedInt[i]) == -1) {
                    swapNumbers(i ,j, unsortedInt);
                }
            }
        }

    }


    private static void swapNumbers(int i, int j, BigInteger[] array) {
        BigInteger temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSort(BigInteger[] array, int low, int high) {
        if(low < high) {
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot - 1);

            quickSort(array, pivot+1, high);
        }
    }

    private static int  partition(BigInteger[] array, int low, int high) {
        BigInteger partition = array[high];

        int i = low - 1;
        for(int  j = low; j <= high - 1; j++) {
            if(array[j].compareTo(partition) == -1 || array[j].compareTo(partition) == 0) {
                i++;
                swapNumbers(i, j, array);
            }
        }

        swapNumbers(i+1, high, array);
        return i+1;
    }
}
