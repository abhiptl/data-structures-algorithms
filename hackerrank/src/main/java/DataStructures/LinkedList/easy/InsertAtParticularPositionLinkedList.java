package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

public class InsertAtParticularPositionLinkedList {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode currNode = head;

        if(head == null) return newNode;

        int nodeCount = 1;
        while(nodeCount < position) {

            currNode = currNode.next;
            nodeCount++;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;

        return head;



    }
}
