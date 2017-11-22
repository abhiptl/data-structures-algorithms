package Algorithms.Recursion;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "A", "B", "C");
    }

    public static void solve(int n, String start, String intermediate, String end) {
        if(n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n-1, start, end ,intermediate);
            System.out.println(start + " -> " + end);
            solve(n-1, intermediate, start ,end);
        }
    }


}
