package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L1971 {
    public static void main(String[] args) {

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
        }
        for(int[] e : edges){
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(source,list,destination,visited);
    }

    static boolean dfs(int node, List<List<Integer>> list, int d, boolean[] visited){
        if(node == d){
            return true;
        }
        visited[node] = true;
        for(int i : list.get(node)){
            if(!visited[i]){
                if(dfs(i,list,d,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
