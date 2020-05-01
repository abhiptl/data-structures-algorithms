package DataStructures.Tree.easy;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/tree-top-view/problem
 */
public class TopViewPrint {

    static class Tuple {
        int data;
        int level;
        int width;

        public Tuple(int data, int level, int width) {
            this.data = data;
            this.level = level;
            this.width = width;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

    }
    public static void topView(Node root) {
        Map<Integer, Tuple> map = new HashMap<>();

        if(root != null) {
            map.put(0, new Tuple(root.data, 1, 0));
            iterate(root, map, 0, 1);

        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(Integer key : keys) {
            System.out.print(map.get(key).getData()+ " ");
        }

    }
    public static void iterate(Node node,Map<Integer, Tuple> map, int width, int level) {
        if(node == null) {
            return;
        }

        if(node.left != null) {
            if(map.containsKey(width-1)) {
                if(map.get(width-1).getLevel() > (level+1)) {
                    map.put(width-1, new Tuple(node.left.data, level+1, width-1));
                }
            } else {
                map.put(width-1, new Tuple(node.left.data, level+1, width-1));
            }

            iterate(node.left, map, width-1, level+1);
        }

        if(node.right != null) {
            if(map.containsKey(width+1)) {
                if(map.get(width+1).getLevel() > (level+1)) {
                    map.put(width+1, new Tuple(node.right.data, level+1, width+1));
                }

            } else {
                map.put(width+1, new Tuple(node.right.data, level+1, width+1));
            }

            iterate(node.right, map, width+1, level+1);
        }

    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}

