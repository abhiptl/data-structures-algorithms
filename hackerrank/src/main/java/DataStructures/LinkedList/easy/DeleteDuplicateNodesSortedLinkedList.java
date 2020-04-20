package DataStructures.LinkedList.easy;

import DataStructures.LinkedList.SinglyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
 */
public class DeleteDuplicateNodesSortedLinkedList {
    SinglyLinkedListNode RemoveDuplicates(SinglyLinkedListNode head) {

        Set<Integer> hashSet = new HashSet<>();

        if(head != null) {
            int elementData;
            SinglyLinkedListNode prevNode = null;
            SinglyLinkedListNode currentNode = head;
            while (currentNode != null) {
                elementData = currentNode.data;

                if(!hashSet.add(elementData)) {
                    prevNode.next = currentNode.next;
                    currentNode = currentNode.next;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
        }

        return head;
    }
}
