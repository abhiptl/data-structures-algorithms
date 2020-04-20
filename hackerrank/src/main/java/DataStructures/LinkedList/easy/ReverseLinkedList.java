package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseLinkedList {

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode prev = null;
        if(head == null) return head;
        SinglyLinkedListNode immediateNext = null;
        while(curr != null) {
            immediateNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = immediateNext;
        }

        return prev;
    }


}
