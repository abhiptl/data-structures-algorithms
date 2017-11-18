package DataStructures.Tree.easy;

import DataStructures.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class LevelOrderTraversal {
    void levelOrder(TreeNode root) {
        TreeNode n=new TreeNode();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty())
        {
            n=q.remove();
            if(n.left != null)q.add(n.left);
            if(n.right != null)q.add(n.right);
            System.out.print(n.data+" ");
        }

    }


}
