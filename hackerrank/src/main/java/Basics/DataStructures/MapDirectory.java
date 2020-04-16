package Basics.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book/problem
 */
public class MapDirectory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneDirectory = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();

            phoneDirectory.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer phoneNumber = phoneDirectory.get(s);
            if(phoneNumber != null) {
                System.out.println(s+"="+phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
