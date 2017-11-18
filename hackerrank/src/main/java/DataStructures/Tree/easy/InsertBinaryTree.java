package DataStructures.Tree.easy;

/**
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 */
public class InsertBinaryTree {
    static Node Insert(Node root,int value) {
        if(root == null){
            Node node = new Node();
            node.data = value;
            return node;
        }
        else {
            Node cur;
            if(value <= root.data){
                cur = Insert(root.left, value);
                root.left = cur;
            }
            else{
                cur = Insert(root.right, value);
                root.right = cur;
            }
            return root;
        }

    }

}
