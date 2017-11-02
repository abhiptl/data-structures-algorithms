package Algorithms.Warmups.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {
    static String timeConversion(String s) {
        StringBuilder builder = new StringBuilder();

        String[] split = s.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2].substring(0,2));
        String amPm = split[2].substring(2,4);

        if(hours == 12 && minutes == 0 && seconds == 0) {
            if(amPm.equals("AM")) { // 12:00:00 AM = 00:00:00
                builder.append("00").append(":");
            } else { // 12:00:00 PM = 12:00:00
                builder.append("12").append(":");
            }

            builder.append("00").append(":");
            builder.append("00");
        } else {
            if(amPm.equals("PM") && hours != 12) { // 12:05:39PM = 12:05:39
                hours += 12;
            }

            if(amPm.equals("AM") && hours == 12) { // 12:05:39AM = 00:05:39
                hours = 0;
            }

            builder.append(String.format("%02d", hours)).append(":");
            builder.append(String.format("%02d", minutes)).append(":");
            builder.append(String.format("%02d", seconds));
        }


        return builder.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
