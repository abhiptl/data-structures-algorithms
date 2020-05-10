package DataStructures.Heap.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/qheap1/problem
 */
public class HeapOperation {
    private static List<BigInteger> heap = new ArrayList<>();


    public static void insert(BigInteger data) {
        heap.add(data);

        int current = heap.size()-1;

        while(heap.get(current).compareTo(heap.get(parent(current))) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public static int parent(int pos) {
        return pos/2;
    }

    public static int leftChild(int pos) {
        return pos*2;
    }

    public static boolean isLeaf(int pos) {
        if(pos >= heap.size()/2 && pos <= heap.size()) {
            return true;
        }

        return false;
    }

    public static void swap(int position1, int position2) {
        BigInteger temp = heap.get(position1);

        heap.set(position1, heap.get(position2));
        heap.set(position2, temp);
    }

    public static int rightChild(int pos) {
        return pos*2 + 1;
    }

    public static void delete(BigInteger data) {
        heap.remove(data);
    }

    public static void printMinimum() {
        System.out.println(heap.get(0));
    }

    public static void main(String[] args) {
        //heap.add(new BigInteger(Math.pow(10,-9)));
        Scanner sc= new Scanner(System.in);
        int q = sc.nextInt();

        for(int i = 1; i<=q; i++) {
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    BigInteger data = sc.nextBigInteger();
                    insert(data);
                    break;
                case 2:
                    BigInteger deleteData = sc.nextBigInteger();
                    delete(deleteData);
                    break;
                case 3:
                    printMinimum();
                    break;
            }
        }
    }
}
