package DataStructures.LinkedList.easy;

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

class Node {
    int data;
    Node next;
}