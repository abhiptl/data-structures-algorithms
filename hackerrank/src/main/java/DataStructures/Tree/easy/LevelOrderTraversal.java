package DataStructures.Tree.easy;

import DataStructures.Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class LevelOrderTraversal {
    void levelOrder(Node root) {
        Node n=new Node();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty())
        {
            n=q.remove();
            if(n.left != null)q.add(n.left);
            if(n.right != null)q.add(n.right);
            System.out.print(n.data+" ");
        }

    }

    /* Function to line by line print level order traversal a tree*/
    void printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
        {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(DataStructures.Tree.Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at a given level */
    void printGivenLevel(DataStructures.Tree.Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.data);
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}


