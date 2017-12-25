package Algorithms.Graph;

/**
 * https://www.geeksforgeeks.org/count-possible-paths-source-destination-exactly-k-edges/
 *
 * Time Complexity : O(v ^ k)
 */
public class PathFromSourceToDestWithEdges {

    static final int V = 4; //Number of vertices

    int countWalks(int graph[][], int u, int v, int k)
    {
        // Base cases
        if (k == 0 && u == v)           return 1;
        if (k == 1 && graph[u][v] == 1) return 1;
        if (k <= 0)                     return 0;

        // Initialize result
        int count = 0;

        // Go to all adjacents of u and recur
        for (int i = 0; i < V; i++)
            if (graph[u][i] == 1)  // Check if is adjacent of u
                count += countWalks(graph, i, v, k-1);

        return count;
    }

    public static void main(String[] args) {
        int graph[][] =new int[][] { {0, 1, 1, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };
        int u = 0, v = 3, k = 2;

        PathFromSourceToDestWithEdges p = new PathFromSourceToDestWithEdges();
        System.out.println(p.countWalks(graph, u, v, k));
    }
}
