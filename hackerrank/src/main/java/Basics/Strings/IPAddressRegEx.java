package Basics.Strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-regex/problem
 */
public class IPAddressRegEx {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }


}


class MyRegex {
    public String pattern = "^([01][0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?|[3456789][0-9]?)\\.([01][0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?|[3456789][0-9]?)\\.([01][0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?|[3456789][0-9]?)\\.([01][0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?|[3456789][0-9]?)$";
}