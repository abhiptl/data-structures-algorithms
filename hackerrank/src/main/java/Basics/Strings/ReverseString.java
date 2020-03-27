package Basics.Strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();

        int length = A.length();
        boolean isPalindrome = true;
        for(int i = 0; i < length/2; i++) {
            if(A.charAt(i) != A.charAt((length-1-i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println((isPalindrome) ? "Yes" : "No");
    }

}
