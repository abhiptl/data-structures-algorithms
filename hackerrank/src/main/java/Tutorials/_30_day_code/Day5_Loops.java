package Tutorials._30_day_code;

import java.util.Scanner;

public class Day5_Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result;
        for(int i = 1; i<= 10; i++) {
            result = n * i;

            System.out.printf("%d x %d = %d", n, i, result);
            System.out.println("");
        }
    }
}
