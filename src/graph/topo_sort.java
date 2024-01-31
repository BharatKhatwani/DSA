package graph;
import java.util.*;
public class topo_sort {
     static void dfs(int node ,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,int[] vis){
            vis[node] = 1;
            for (int it:adj.get(node)){
                if (vis[it] == 0){
                    dfs(it,adj,st,vis);
                }
            }
            st.push(node);
        }





        //Function to return list containing vertices in Topological order.
        static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
        {
            // add your code here
            int vis[] = new int[V];
            Stack <Integer> st = new Stack<Integer>();
            for (int i =0 ; i <V ; i++){
                if (vis[i] ==0){
                    dfs (i,adj,st,vis);
                }
            }
            int [] ans = new int [V];
            int i =0;
            while(!st.isEmpty()){
                ans[i++] = st.peek();
                st.pop();

            }
            return ans;
        }


    public static void main(String[] args) {

    }
}
