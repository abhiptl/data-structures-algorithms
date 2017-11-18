package DataStructures.Tree.easy;

import DataStructures.Tree.TreeNode;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
public class InOrderTraversal {
    void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

}
