package _03_data_structures._10_1_1;

public class StackApp {
    public static void main(String[] args) {
        _Stack stack = new _Stack(6);
        stack.push(4);
        stack.push(1);
        stack.push(3);

        System.out.println("POP :"+ stack.pop());
        stack.push(8);
        System.out.println("POP :"+ stack.pop());

    }
}
