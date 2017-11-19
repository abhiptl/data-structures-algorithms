package DataStructures.Queue.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 */
public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();


        Stack<String> enQueueStack = new Stack<>();
        Stack<String> deQueueStack = new Stack<>();

        List<String> result = new ArrayList<>();
        int type;
        String enqueueString = "";
        for(int i = 1; i<=q; i++) {
            type = scanner.nextInt();

            if( type == 1) {
                enqueueString = scanner.next();
                enQueueStack.push(enqueueString);
            }

            if (type == 2) {
                if(deQueueStack.isEmpty()) {
                    while (!enQueueStack.isEmpty()) {
                        deQueueStack.push(enQueueStack.pop());
                    }
                }
                deQueueStack.pop();
            }

            if(type == 3) {
                if(deQueueStack.isEmpty()) {
                    while (!enQueueStack.isEmpty()) {
                        deQueueStack.push(enQueueStack.pop());
                    }
                }
                result.add(deQueueStack.peek());
            }
        }

        for(String s : result) {
            System.out.println(s);
        }
    }
}
