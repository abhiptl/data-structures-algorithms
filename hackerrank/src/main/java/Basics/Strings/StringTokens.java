package Basics.Strings;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // Write your code here.
        if(input == "") {
            System.out.println("0");
        } else if(input.length() > 400000) {
            return;
        } else {
            String[] split = input.split("[ !,?\\.\\_'@]+");
            System.out.println(split.length);
            Stream.of(split).forEach(System.out::println);
        }

        scan.close();
    }
}
