package Tutorials._30_day_code;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-data-types/problem
 */
public class Day1DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int inputInteger = scan.nextInt();
        double doubleInput = scan.nextDouble();
        scan.nextLine(); // read last pointer to start of next line
        String inputString = scan.nextLine(); // read full next line

        scan.close();

        int integerSum = inputInteger + i;
        double doubleSum = doubleInput + d;
        String concatString = s + inputString;

        System.out.println(integerSum);
        System.out.println(doubleSum);
        System.out.println(concatString);


    }
}
