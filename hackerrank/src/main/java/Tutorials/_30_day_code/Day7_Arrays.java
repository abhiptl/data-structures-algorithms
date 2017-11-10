package Tutorials._30_day_code;

import java.util.Scanner;

public class Day7_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=n-1; i >=0; i--){
            arr[i] = in.nextInt();
        }
        in.close();

        for(int i = 0;i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
