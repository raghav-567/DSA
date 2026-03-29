package Leetcode;
import java.util.*;

public class L2685 {
    public static void main(String[] args) {
//        You are given an integer n. There is an undirected graph with n vertices, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting vertices ai and bi.
//        Return the number of complete connected components of the graph.
//        A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.
//        A connected component is said to be complete if there exists an edge between every pair of its vertices.
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (bfs(i, list, visited)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean bfs(int node, List<List<Integer>> list, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        int nodes = 0;
        int degreeSum = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            nodes++;
            degreeSum += list.get(curr).size();

            for (int nei : list.get(curr)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }

        int edges = degreeSum / 2;
        return edges == (nodes * (nodes - 1)) / 2;
    }
}
