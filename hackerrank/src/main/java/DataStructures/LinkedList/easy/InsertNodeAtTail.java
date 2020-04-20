package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 */
public class InsertNodeAtTail {

    SinglyLinkedListNode insert(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode tailNode = new SinglyLinkedListNode();
        tailNode.data = data;
        tailNode.next = null;

        if(head != null) {
            SinglyLinkedListNode lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = tailNode;
        }

        return head;

    }

}

