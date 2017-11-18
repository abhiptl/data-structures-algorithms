package DataStructures.Tree;

import java.util.Stack;

/**
 * http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
 */
public class InOrderWithoutRecursion {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }

}

class Node {

    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    void inorder() {
        Stack<Node> stack = new Stack<>();

        if(root == null) {
            return;
        }

        Node node = root;
        while(node != null) {
            stack.push(node);
            node = node.left;

        }

        while (!stack.empty()) {
            node = stack.pop();
            System.out.print(node.data + " ");

            if(node.right != null) {
                node = node.right;
                while(node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }
}