package Algorithms.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<=n; i++) {
            System.out.println(fibonacci(i));
        }

    }

    public static int fibonacci(int n)  {
        if(n == 0) {
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
