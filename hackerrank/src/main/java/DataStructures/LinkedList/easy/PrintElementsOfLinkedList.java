package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
public class PrintElementsOfLinkedList {
    public void printElements(SinglyLinkedListNode head) {
        if(head != null) {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
}

