package Amazon.easy;

import java.util.*;

/**
 * https://practice.geeksforgeeks.org/problems/pairs-with-positive-negative-values/0
 */
public class PositiveNegativePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        List<List<Integer>> result = new ArrayList<>();
        for(int t = 0; t< T; t++) {
            int N = scanner.nextInt();

            Integer[] numbers = new Integer[N];
            for(int i = 0; i < N; i++) {
                numbers[i] = Integer.valueOf(scanner.nextInt());
            }

            List<Integer> returnList = findPositiveNegativePairNumbers(numbers);
            Collections.sort(returnList);
            result.add(returnList);

        }

        for(List<Integer> number : result) {
            if(number.size() == 0) {
                System.out.println("0");
            } else {
                for(Integer num : number) {
                    System.out.print(num*-1 + " ");
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        }
    }

    public static List<Integer> findPositiveNegativePairNumbers(Integer[] numbers) {
        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< numbers.length; i++) {
            if(map.containsKey(Math.abs(numbers[i]))) {
                map.remove(Math.abs(numbers[i]));
                list.add(Math.abs(numbers[i]));
            } else {
                map.put(Math.abs(numbers[i]), numbers[i]);
            }
        }

        return list;
    }
}
