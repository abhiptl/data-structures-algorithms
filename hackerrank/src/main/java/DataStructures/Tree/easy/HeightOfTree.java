package DataStructures.Tree.easy;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class HeightOfTree {
    static int height(Node root) {
        if (root == null){
            return -1;
        }
        else{
            return 1 + Math.max( height(root.left), height(root.right) );
        }

    }
}

class Node{
        int data;
        Node left;
        Node right;
}