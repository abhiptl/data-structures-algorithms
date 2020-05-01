package DataStructures.Tree.medium;

import DataStructures.Tree.Node;

import java.util.ArrayList;
import java.util.List;

public class IsTreeBST {

    boolean checkBST(Node root) {
        if(root != null) {
            List<Integer> list = new ArrayList<>();

            inOrderTraversal(root, list);
            return isSorted(list);
        } else {
            return false;
        }
    }
    void inOrderTraversal(Node root, List<Integer> list) {
        if(root == null) return;

        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }

    boolean isSorted(List<Integer> list) {
        for(int i = 0 ;i<list.size() - 1; i++) {
            if(list.get(i) >= list.get((i+1))){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {

    }
}
