package DataStructures.Queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(3);
        queue.add(4);
        queue.add(7);

        System.out.println(queue.poll());

    }
}
