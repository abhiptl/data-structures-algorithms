package Basics.Introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class StaticInitializer {

    static int B;
    static int H;
    static boolean flag;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        flag = true;
        if(B <=0 || H <=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = true;

        }
    }
    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
