package Algorithms.Graph.topologicalsorting;

import Algorithms.Graph.Graph;

import java.util.ListIterator;
import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/topological-sorting/
 *
 * Time Complexity : O(V+E)
 *
 * Application : Dependency Resolution
 */
public class TopologicalSorting {

    public static void topologySort(Graph g, int vertex , boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;

        ListIterator<Integer> iterator = g.adjList[vertex].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if(!visited[n]) {
                topologySort(g, n, visited, stack);
            }

        }

        stack.push(vertex);
    }

    public static Stack doTopologicalSorting(Graph g) {
        boolean[] visited = new boolean[g.V];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< g.V; i++) {
            if(!visited[i]) {
                topologySort(g ,i ,visited, stack);
            }
        }

        return stack;

    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        Stack<Integer> stack = doTopologicalSorting(g);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
