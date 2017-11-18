package DataStructures.Tree.easy;

import DataStructures.Tree.TreeNode;

/**
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 *
 * Time Complexity : o(n)
 */
public class PreOrderTraversal {
    void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
