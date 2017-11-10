package Tutorials._30_day_code;

import java.util.Scanner;

public class Day6_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] s = new String[t];


        char[] chars;
        String evenString="";
        String oddString="";

        for(int i = 0; i < t; i++) {
            s[i] = scanner.next();
        }

        for(int i = 0; i< t; i++) {

            chars = s[i].toCharArray();

            evenString = "";
            oddString = "";
            for(int j = 0; j < chars.length; j++) {
                if((j% 2) == 0) {
                    evenString = evenString.concat(String.valueOf(chars[j]));
                } else {
                    oddString = oddString.concat(String.valueOf(chars[j]));
                }
            }

            System.out.println(evenString +" "+ oddString);
        }
    }
}
