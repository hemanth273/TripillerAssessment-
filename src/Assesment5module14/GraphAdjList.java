package Assesment5module14;

    import java.util.*;

    class GraphAdjList {

        static class Graph {
            int vertices;                     // Number of vertices
            LinkedList<Integer>[] adjList;    // Array of linked lists

            // Constructor
            Graph(int v) {
                vertices = v;
                adjList = new LinkedList[v];
                for (int i = 0; i < v; i++) {
                    adjList[i] = new LinkedList<>();
                }
            }

            // Add edge to undirected graph
            void addEdge(int src, int dest) {
                adjList[src].add(dest);
                adjList[dest].add(src);
            }

            // Display adjacency list
            void printGraph() {
                for (int i = 0; i < vertices; i++) {
                    System.out.print(i + ": ");
                    for (Integer neighbor : adjList[i]) {
                        System.out.print(neighbor + " ");
                    }
                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {
            int V = 5; // Number of vertices
            Graph g = new Graph(V);

            // Add edges
            g.addEdge(0, 1);
            g.addEdge(0, 4);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(1, 4);
            g.addEdge(2, 3);
            g.addEdge(3, 4);

            // Print adjacency list
            System.out.println("Graph representation (Adjacency List):");
            g.printGraph();
        }
    }

