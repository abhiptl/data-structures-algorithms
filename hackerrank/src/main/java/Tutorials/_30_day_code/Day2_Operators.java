package Tutorials._30_day_code;

import java.util.Scanner;

public class Day2_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        double tip = mealCost * (tipPercent / 100d);
        double tax = mealCost * (taxPercent / 100d);

        double total = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(total);
        System.out.printf("The total meal cost is %d dollars.", totalCost);
        // Print your result
    }
}
