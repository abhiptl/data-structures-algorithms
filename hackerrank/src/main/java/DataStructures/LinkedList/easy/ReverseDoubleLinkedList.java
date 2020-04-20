package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.DoublyLinkedListNode;

public class ReverseDoubleLinkedList {
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if(head == null) return head;

        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode currNext = null;
        DoublyLinkedListNode currPrev = null;
        while(curr != null) {
            currNext = curr.next;
            currPrev = curr.prev;

            curr.next = currPrev;
            curr.prev = currNext;

            curr = currNext;

        }
        if(currPrev != null) {
            head = currPrev.prev;
        }
        return head;

    }
}
