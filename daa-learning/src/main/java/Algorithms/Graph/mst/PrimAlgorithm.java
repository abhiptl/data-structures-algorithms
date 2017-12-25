package Algorithms.Graph.mst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://www.geeksforgeeks.org/greedy-algorithms-set-5-prims-minimum-spanning-tree-mst-2/
 *
 * A minimum spanning tree (MST) or minimum weight spanning tree for a weighted,
 * connected and undirected graph is a spanning tree with weight less than or equal to the weight of every other spanning tree.
 *
 * Time Complexity : O(v^2)
 *
 * If we store Graph as Adjacency List then using MinHeap can be reduced to O(E logV).
 *
 * Applications
 *  1. Network Design
 *      Ex. Telephone line connecting all office of your business in different cities.
 *
 *
 */
public class PrimAlgorithm {

    public void minimumSpanningTree(int[][] graph) {
        int V = graph.length;
        Integer[] keyValue = new Integer[V];
        Boolean[] mstVertexSet = new Boolean[V];
        Integer[] parentVertexSet = new Integer[V];

        for(int i = 0;i < V; i++) {
            keyValue[i] = Integer.MAX_VALUE;
            mstVertexSet[i] = false;
        }
        keyValue[0] = 0;
        parentVertexSet[0] = -1;

        for(int count = 0; count < V-1; count++) {

            int minKeyValueVertex = minimumKeyValueVertex(keyValue, mstVertexSet);
            mstVertexSet[minKeyValueVertex] = true;

            int[] adjacentWeight = graph[minKeyValueVertex];
            for(int v = 0; v< adjacentWeight.length; v++) {
                if(adjacentWeight[v] != 0) {
                    if(mstVertexSet[v] == false && adjacentWeight[v] < keyValue[v]) {
                        keyValue[v] = adjacentWeight[v];
                        parentVertexSet[v] = minKeyValueVertex;
                    }
                }
            }
        }


        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parentVertexSet[i]+" - "+ i+"    "+
                    graph[parentVertexSet[i]][i]);



    }

    private int minimumKeyValueVertex(Integer[] keyValue, Boolean[] mstVertexSet) {
        int minKeyValue = Integer.MAX_VALUE;
        int minKeyValueVertex = -1;
        for(int i = 0; i < keyValue.length;i++) {
            if(mstVertexSet[i] == false && keyValue[i] < minKeyValue) {
                minKeyValue = keyValue[i];
                minKeyValueVertex = i;
            }
        }

        return minKeyValueVertex;
    }

    public static void main(String[] args) {
        int[][] weightedGraph = new int[][] {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        PrimAlgorithm p = new PrimAlgorithm();
        p.minimumSpanningTree(weightedGraph);
    }
}
