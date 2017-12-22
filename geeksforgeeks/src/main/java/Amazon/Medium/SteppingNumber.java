package Amazon.Medium;

import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/stepping-numberswrong-output/0
 */
public class SteppingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] result = new int[T];
        for(int t = 0; t<T; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            result[t] = findSteppingNumbers(n, m);
        }

        for(int r : result) {
            System.out.println(r);
        }
    }

    private static int findSteppingNumbers(int n, int m) {
        int count = 0;
        String number = "";
        for(int k = n; k<=m; k++) {
            number = String.valueOf(k);
            if(isSteppingNumber(number)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isSteppingNumber(String num) {
        if(num.length() == 1) {
            return true;
        } else {
            int prev;
            int curr;
            for(int i = 1; i< num.length(); i++) {
                prev = Integer.parseInt(String.valueOf(num.charAt(i-1)));
                curr = Integer.parseInt(String.valueOf(num.charAt(i)));

                if(!(curr - prev == -1 || curr - prev == 1)) {
                    return false;
                }
            }

            return true;
        }
    }

}
