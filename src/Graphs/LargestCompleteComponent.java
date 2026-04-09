package Graphs;
import java.util.*;

public class LargestCompleteComponent {
    public static void main(String[] args) {
//        Write a method, largestComponent, that takes in the adjacency list of an undirected graph. The method should return the size of the largest connected component in the graph.
    }

    public static int largestComponent(Map<Integer, List<Integer>> graph) {
        int count = 0;
        int max = 0;
        HashSet<Integer> visited = new HashSet<>();

        for (int node : graph.keySet()) {
            count = dfs(node, visited, graph);
            if (count > max) max = count;
        }

        return max;
    }

    public static int dfs(int node, HashSet<Integer> visited, Map<Integer, List<Integer>> graph) {
        if (visited.contains(node)) {
            return 0;
        }
        visited.add(node);

        int count = 1;
        for (int nei : graph.get(node)) {

            count += dfs(nei, visited, graph);

        }
        return count;
    }
}
