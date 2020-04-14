package Basics.BigNumbers;

import java.math.BigDecimal;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
public class SortBigDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n];

        for(int i=0;i<n;i++){
            s[i]=sc.next();

        }
        sc.close();

        BigDecimal num[] = new BigDecimal[n];
        for(int i = 0; i < n; i++) {
            num[i] = new BigDecimal(s[i]);
        }

        String tempStr = "";
        BigDecimal tempNum = null;
        for(int i = 0; i< n-1; i++) {
            for(int j = 0; j < n-1; j++) {
                if(num[j].compareTo(num[j+1]) < 0) {
                    tempStr = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tempStr;

                    tempNum = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tempNum;
                }
            }
        }

        for(int i =  0; i<n; i++) {
            System.out.println(s[i]);
        }

    }
}


