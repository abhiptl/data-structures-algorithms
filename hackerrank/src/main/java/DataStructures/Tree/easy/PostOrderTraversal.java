package DataStructures.Tree.easy;

import DataStructures.Tree.Node;

/**
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 *
 * Time Complexity : o(n)
 */
public class PostOrderTraversal {
    void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.println(root.data + " ");
    }
}
