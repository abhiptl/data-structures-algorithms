package _03_data_structures.Stack;

public class _Stack {
    private int top = -1;
    private int[] elements;

    public _Stack(int n) {
        elements = new int[n];
    }

    public void push(int number) {
        if(top == elements.length) {
            throw new RuntimeException("Stack overflow");
        }

        top = top + 1;
        elements[top] = number;
    }

    public int pop() {
        if(elements.length == 0) {
            throw new RuntimeException("Stack underflow");
        }

        int popNumber = elements[top];
        top = top - 1;
        return popNumber;
    }
}
