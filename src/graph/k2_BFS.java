package graph;

import java.util.ArrayList;
import java.util.*;

public class k2_BFS {
    public ArrayList<Integer> bfsofGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList <Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean [V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true ;
        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)){
                if (vis[it] == false ){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

        public static void main(String[] args) {
            // Example graph represented as an adjacency list
            int V = 5; // Number of vertices
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            // Adding edges to the graph
            adj.get(0).add(1);
            adj.get(0).add(2);
            adj.get(1).add(3);
            adj.get(1).add(4);

            k2_BFS bfsObject = new k2_BFS();
            ArrayList<Integer> result = bfsObject.bfsofGraph(V, adj);

            System.out.println("BFS traversal of the graph:");
            for (Integer node : result) {
                System.out.print(node + " ");
            }
        }
    }

