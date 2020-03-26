package Basics.Introduction;

import java.util.Calendar;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
public class DateUtility {
    public static String findDay(int month, int date, int year) {
        Calendar randomDate = Calendar.getInstance();
        randomDate.set(Calendar.YEAR, year);
        randomDate.set(Calendar.MONTH, month-1);
        randomDate.set(Calendar.DATE, date);

        int dayOfWeek = randomDate.get(Calendar.DAY_OF_WEEK);
        String returnDayOfWeek = null;
        if(dayOfWeek == 1) returnDayOfWeek = "SUNDAY";
        if(dayOfWeek == 2) returnDayOfWeek = "MONDAY";
        if(dayOfWeek == 3) returnDayOfWeek = "TUESDAY";
        if(dayOfWeek == 4) returnDayOfWeek = "WEDNESDAY";
        if(dayOfWeek == 5) returnDayOfWeek = "THURSDAY";
        if(dayOfWeek == 6) returnDayOfWeek = "FRIDAY";
        if(dayOfWeek == 7) returnDayOfWeek = "SATURDAY";

        return returnDayOfWeek;
    }
    public static void main(String[] args)  {
        System.out.println(DateUtility.findDay(3,26,2020));
    }
}
