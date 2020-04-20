package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
 */
public class InsertInSortedDoubleLinkedList {
    SinglyLinkedListNode SortedInsert(SinglyLinkedListNode head, int data) {

        if(head == null) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode();
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
        } else {
            SinglyLinkedListNode currentNode = head;

            while (currentNode.next != null && currentNode.next.data <= data) {
                currentNode = currentNode.next;
            }

            SinglyLinkedListNode newNode = new SinglyLinkedListNode();
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
