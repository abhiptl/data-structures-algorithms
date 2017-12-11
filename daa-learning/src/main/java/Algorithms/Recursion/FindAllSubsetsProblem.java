package Algorithms.Recursion;

import java.util.Scanner;

/**
 * Time Complexity O(2^n)
 */
public class FindAllSubsetsProblem {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        int[] temp = new int[n];
        boolean[] status = new boolean[n];

        for(int i = 0;i < n; i++) {
            data[i] = scanner.nextInt();
            temp[i] = 0;
        }

        findSubsets(data, n, 0, status, temp);
        System.out.println("Total pairs :" + count);
     }

    public static void findSubsets(int[] data, int n, int i, boolean[] status, int[] temp){
        if(i == n) {
            System.out.print("Subset " +(count++) + "  {");
            for(int j = 0; j < n; j++) {
                if(status[j] == true) {
                    System.out.print(temp[j] + ",");
                }
            }
            System.out.print("}");
            System.out.println();
            return;
        }


        status[i] = false;
        findSubsets(data, n, i+1, status, temp);

        temp[i] = data[i];
        status[i] = true;
        findSubsets(data, n, i+1, status, temp);
    }

}
