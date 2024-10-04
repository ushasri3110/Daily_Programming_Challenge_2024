import java.util.*;
public class DetectCycleInUndirectedGraph {
    private List<List<Integer>> adjList;
    private boolean[] visited;

    public DetectCycleInUndirectedGraph(int V) {
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[V];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public boolean hasCycle() {
        for (int i = 0; i < adjList.size(); i++) {
            if (!visited[i]) {
                if (dfs(i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int node, int parent) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int E = 5; // Number of edges
        DetectCycleInUndirectedGraph graph = new DetectCycleInUndirectedGraph(V);
        int[][] edges = {
                {0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}
        };
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        boolean containsCycle = graph.hasCycle();
        System.out.println(containsCycle);
    }
}
