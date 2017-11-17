package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.Node;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
 */
public class InsertInSortedDoubleLinkedList {
    Node SortedInsert(Node head, int data) {

        if(head == null) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
        } else {
            Node currentNode = head;

            while (currentNode.next != null && currentNode.next.data <= data) {
                currentNode = currentNode.next;
            }

            Node newNode = new Node();
            newNode.data = data;

            if(currentNode.next == null) {
                newNode.next = null;
                newNode.prev = currentNode;
                currentNode.next = newNode;
            } else {
                newNode.next = currentNode.next;
                newNode.prev = currentNode;
                currentNode.next = newNode;
            }

        }

        return head;
    }
}
