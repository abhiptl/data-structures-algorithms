package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.Node;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
public class PrintElementsOfLinkedList {
    public void printElements(Node head) {
        if(head != null) {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
}

