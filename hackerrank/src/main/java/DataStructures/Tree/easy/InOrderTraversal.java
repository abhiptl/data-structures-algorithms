package DataStructures.Tree.easy;

import DataStructures.Tree.Node;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 *
 * Time Complexity : o(n)
 */
public class InOrderTraversal {
    void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

}
