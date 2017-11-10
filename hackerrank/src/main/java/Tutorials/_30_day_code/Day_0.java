package Tutorials._30_day_code;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/30-hello-world/problem
 */
public class Day_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
