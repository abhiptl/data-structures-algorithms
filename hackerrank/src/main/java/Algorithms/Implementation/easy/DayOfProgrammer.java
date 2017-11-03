package Algorithms.Implementation.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfProgrammer {

    static String solve(int year){
        int[] nonLeapMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfProgrammer = 256;
        StringBuilder builder = new StringBuilder();

        int calculatedDays = 0;
        int[] months;

        if(isJulian(year)) {
            if(isJulianLeapYear(year)) {
                months = leapMonths;
            } else {
                months = nonLeapMonths;
            }

        } else {
            if(isGregorianLeapYear(year)) {
                months = leapMonths;
            } else {
                months = nonLeapMonths;
            }
        }

        int i;
        for(i = 0 ;i < months.length; i++) {
            calculatedDays += months[i];

            if(calculatedDays == dayOfProgrammer) {
                builder.append(String.format("%02d", months[i])).append(".");
                builder.append(String.format("%02d", (i+1))).append(".");
                builder.append(String.format("%02d", year));
                break;
            } else if(calculatedDays > dayOfProgrammer) {
                int date = dayOfProgrammer - (calculatedDays - months[i]);
                builder.append(String.format("%02d", date)).append(".");
                builder.append(String.format("%02d", (i+1))).append(".");
                builder.append(String.format("%02d", year));
                break;
            } else {

            }
        }

        if(year == 1918) {
            builder = new StringBuilder();
            if(calculatedDays == dayOfProgrammer) {
                builder.append(String.format("%02d", 13)).append(".");
                builder.append(String.format("%02d", (i+2))).append(".");
                builder.append(String.format("%02d", year));
            } else if(calculatedDays > dayOfProgrammer) {
                int date = dayOfProgrammer - (calculatedDays - months[i]);
                int newDate = date + 13;

                if(newDate <= months[i]) {
                    builder.append(String.format("%02d", newDate)).append(".");
                    builder.append(String.format("%02d", (i+1))).append(".");
                    builder.append(String.format("%02d", year));
                } else {
                    builder.append(String.format("%02d", (newDate - months[i]))).append(".");
                    builder.append(String.format("%02d", (i+2))).append(".");
                    builder.append(String.format("%02d", year));
                }

            }


        }


        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

    public static boolean isJulian(int year) {
        return (year>= 1700 && year<=1917);
    }

    public static boolean isJulianLeapYear(int year) {
        if(year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isGregorianLeapYear(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
