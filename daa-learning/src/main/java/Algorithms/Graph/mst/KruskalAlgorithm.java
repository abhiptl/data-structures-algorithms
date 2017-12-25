package Algorithms.Graph.mst;

import Algorithms.Graph.cycledetection.Graph;

import java.util.*;

/**
 * @link https://www.geeksforgeeks.org/greedy-algorithms-set-2-kruskals-minimum-spanning-tree-mst/
 *
 * Time Complexity :O(ElogE) or O(ElogV). Sorting of edges takes O(ELogE) time.
 * After sorting, we iterate through all edges and apply find-union algorithm.
 * The find and union operations can take atmost O(LogV) time. So overall complexity is O(ELogE + ELogV) time.
 * The value of E can be atmost O(V2), so O(LogV) are O(LogE) same. Therefore, overall time complexity is O(ElogE) or O(ElogV)
 */
public class KruskalAlgorithm {

    public void kruskalMinimumSpanningTree(Graph graph) {
       List<Graph.Edge> edges = Arrays.asList(graph.edges);

        List<Graph.Edge> resultEdges = new ArrayList<>();

       Collections.sort(edges, new Comparator<Graph.Edge>() {
           @Override
           public int compare(Graph.Edge o1, Graph.Edge o2) {
               return o1.weight - o2.weight;
           }
       });

       int[] parent = new int[graph.V];

       for(int i = 0; i< graph.V; i++) {
            parent[i] = -1;
       }

       for(Graph.Edge edge : edges) {
           if(resultEdges.size() >= graph.V - 1) {
               break;
           }

           int  x = graph.find(parent, edge.src);
           int  y = graph.find(parent, edge.dest);

           if( x != y) {
               resultEdges.add(edge);
               graph.union(parent, x, y);
           }
       }

        for (int i = 0; i < resultEdges.size(); ++i)
            System.out.println(resultEdges.get(i).src+" -- " +
                    resultEdges.get(i).dest+" == " + resultEdges.get(i).weight);
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;

        Graph graph = new Graph(V, E);
        graph.edges[0].src = 0;
        graph.edges[0].dest = 1;
        graph.edges[0].weight = 10;

        // add edge 0-2
        graph.edges[1].src = 0;
        graph.edges[1].dest = 2;
        graph.edges[1].weight = 6;

        // add edge 0-3
        graph.edges[2].src = 0;
        graph.edges[2].dest = 3;
        graph.edges[2].weight = 5;

        // add edge 1-3
        graph.edges[3].src = 1;
        graph.edges[3].dest = 3;
        graph.edges[3].weight = 15;

        // add edge 2-3
        graph.edges[4].src = 2;
        graph.edges[4].dest = 3;
        graph.edges[4].weight = 4;

        KruskalAlgorithm k = new KruskalAlgorithm();
        k.kruskalMinimumSpanningTree(graph);
    }
}

