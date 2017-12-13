package Amazon.Basics;

import java.util.Scanner;

public class FindHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] result = new int[T];
        for(int t = 1; t<=T; t++) {
            int N = scanner.nextInt();
            int[] numbers = new int[N];
            for(int i = 0; i<N; i++) {
                numbers[i] = scanner.nextInt();
            }

            result[t-1] = findHighest(numbers);
        }

        for(int j = 0; j<T; j++) {
            System.out.println(result[j]);
        }
    }

    public static int findHighest(int[] numbers) {
        int highest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        return highest;
    }
}
