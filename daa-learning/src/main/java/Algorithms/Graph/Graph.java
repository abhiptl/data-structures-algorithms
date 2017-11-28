package Algorithms.Graph;

import java.util.LinkedList;

/**
 * Graph Implementation using AdjacentList
 *
 * Adding new Edge is easier. O(1)
 *
 * Searching New Edge worst case : O(V)
 *
 * Worst Case space required O(V^2)
 */
public class Graph {
    public int V; // number of vertex
    public LinkedList<Integer> adjList[];

    public Graph(int V) {
        this.V = V;

        adjList = new LinkedList[V];
        for(int i = 0;i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int dest) {
        adjList[source].add(dest);
    }


}
