package Algorithms.Graph.cycledetection;

/**
 *
 */
public class Graph {
    public int V;
    public int E;
    public Edge[] edges;

    public Graph(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new Edge[E];

        for(int i = 0; i < E; i++) {
            edges[i] = new Edge();
        }
    }

    public Graph(int v, int e, Edge[] edges) {
        V = v;
        E = e;
        this.edges = edges;
    }

    /**
     *
     * Time Complexity worst case: O(n)
     */
    public int find(int[] parents, int i) {
        if(parents[i] == -1) {
            return i;
        }

        return find(parents, parents[i]);
    }

    /**
     *
     * Time Complexity worst case: O(n)
     */
    public void union(int[] parents, int x, int y) {
        int xSet = find(parents,x);
        int ySet = find(parents, y);
        parents[xSet] = ySet;
    }


    public int isCycle(Graph graph) {
        int[] parents = new int[graph.V];
        for(int i = 0; i < graph.V; i++) {
            parents[i] = -1;
        }


        for(int i = 0; i < graph.edges.length; i++) {
            Edge e = graph.edges[i];

            int x = graph.find(parents, e.src);
            int y = graph.find(parents, e.dest);

            if(x == y) {
                return 1;
            }
            graph.union(parents, x, y);
        }

        return 0;
    }

    public class Edge {
        public int src;
        public int dest;
        public int weight;

        public Edge() {

        }

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

    }


}
