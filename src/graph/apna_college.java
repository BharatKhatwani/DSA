// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Declare a class named apna_college
public class apna_college {

    // Declare a static nested class named Edge
    static class Edge {
        int src; // Source vertex of the edge
        int dest; // Destination vertex of the edge
        int weight;

        // Constructor for Edge class
        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Method to create a graph and add edges to it
    public static void creategraph(ArrayList<Edge> graph[]) {
        // Loop through the graph array and initialize each element with a new ArrayList<Edge>
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    // Main method
    public static void main(String[] args) {
        int V = 4; // Number of vertices in the graph
        ArrayList<Edge> graph[] = new ArrayList[V]; // Declare an array to store the adjacency list of the graph
creategraph(graph);
// print 2's neighours
        for(int i =0; i <graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+ " , " + e.weight);
        }


    }
}
