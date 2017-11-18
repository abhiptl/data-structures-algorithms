package DataStructures.Tree.easy;

import DataStructures.Tree.TreeNode;

/**
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class PostOrderTraversal {
    void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.println(root.data + " ");
    }
}
