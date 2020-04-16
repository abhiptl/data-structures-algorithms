package Basics.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for(int i = 1; i<=q; i++) {
            String operation = scanner.next();

            if("Insert".equals(operation)) {
                int index = scanner.nextInt();
                int number = scanner.nextInt();

                list.add(index, number);
            }

            if("Delete".equals(operation)) {
                int index = scanner.nextInt();
                list.remove(index);
            }

        }

        for(Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
