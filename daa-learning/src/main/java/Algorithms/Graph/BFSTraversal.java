package Algorithms.Graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class BFSTraversal {
    static Graph g;
    public static void main(String arg[]) {
        g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        breadFirstSearch(2);
    }

    public static void breadFirstSearch(int source) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[g.V];

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            Integer element = queue.poll();
            System.out.print(element +" ");

            ListIterator<Integer> adjacentElements = g.adjList[element].listIterator();

            while (adjacentElements.hasNext()) {
                Integer next = adjacentElements.next();
                if(!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}
