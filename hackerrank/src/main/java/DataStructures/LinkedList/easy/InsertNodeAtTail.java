package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.Node;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 */
public class InsertNodeAtTail {

    Node insert(Node head, int data) {
        Node tailNode = new Node();
        tailNode.data = data;
        tailNode.next = null;

        if(head != null) {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = tailNode;
        }

        return head;

    }

}

