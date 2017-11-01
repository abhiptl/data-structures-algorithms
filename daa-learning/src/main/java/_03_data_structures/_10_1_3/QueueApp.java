package _03_data_structures._10_1_3;

public class QueueApp {
    public static void main(String[] args) {
        _Queue queue = new _Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Done");
    }
}
