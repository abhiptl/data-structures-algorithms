package Algorithms.Graph.shortestpath;

/**
 * https://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/
 *
 *  Time Complexity of the implementation is O(V^2).
 *  If the input graph is represented using adjacency list, it can be reduced to O(E log V) with the help of binary heap.
 */
public class DijkstraAlgorithm {

    public void findShortestPath(int[][] graph, int src) {
        Boolean[] visited = new Boolean[graph.length];
        Integer[] shortestDistance = new Integer[graph.length];

        for(int i = 0; i< shortestDistance.length; i++) {
            shortestDistance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        shortestDistance[src] = 0;

        // When loop reaches last vertex, shortestDistance array filled with shorted distance
        for(int count = 0; count < graph.length - 1; count++) {
            int u = findMinimumDistanceVertex(shortestDistance, visited);
            visited[u] = true;

            for(int v = 0; v < graph.length; v++) {
                if(visited[v] == false && graph[u][v] != 0) {
                    if((shortestDistance[u] + graph[u][v] < shortestDistance[v])) {
                        shortestDistance[v] = shortestDistance[u] + graph[u][v];
                    }
                }
            }
        }

        System.out.println("Vertex  Distance(from Source)");
        for (int i = 0; i < graph.length; i++)
            System.out.println(i+"       "+shortestDistance[i]);

    }

    private int findMinimumDistanceVertex(Integer[] shortestDistance, Boolean[] visited) {
        Integer minDistance = Integer.MAX_VALUE;
        int minVertexIndex = -1;
        for(int i = 0; i < shortestDistance.length; i++) {
            if(visited[i] == false && shortestDistance[i] <= minDistance) {
                minVertexIndex = i;
                minDistance = shortestDistance[i];
            }
        }
        return minVertexIndex;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.findShortestPath(graph, 0);
    }
}
