package Algorithms.Graph;

import java.util.ListIterator;

/**
 * Time Complexity : O(V+E)
 */
public class DFSTraversal {
    static Graph g;
    public static void main(String arg[]) {
        g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        boolean[] visited = new boolean[g.V];
        depthFirstSearch(2, visited);
    }

    public static void depthFirstSearch(int source, boolean[] visited) {
        visited[source] = true;
        System.out.print(source + " ");

        ListIterator<Integer> iterator = g.adjList[source].listIterator();

        while (iterator.hasNext()) {
            int n = iterator.next();

            if(!visited[n]) {
                depthFirstSearch(n, visited);
            }

        }

    }
}
