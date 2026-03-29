package Assesment5module14;

    import java.util.*;

    class GraphNeighbors {

        static class Graph {
            int vertices;
            LinkedList<Integer>[] adjList;

            Graph(int v) {
                vertices = v;
                adjList = new LinkedList[v];
                for (int i = 0; i < v; i++) {
                    adjList[i] = new LinkedList<>();
                }
            }

            // Add edge (undirected)
            void addEdge(int src, int dest) {
                adjList[src].add(dest);
                adjList[dest].add(src);
            }

            // Print all neighbors of a node
            void printNeighbors(int node) {
                System.out.print("Neighbors of node " + node + ": ");
                for (Integer neighbor : adjList[node]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int V = 5;
            Graph g = new Graph(V);

            // Add edges
            g.addEdge(0, 1);
            g.addEdge(0, 4);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(1, 4);
            g.addEdge(2, 3);
            g.addEdge(3, 4);

            // Print neighbors for node 1
            g.printNeighbors(1);

            // Print neighbors for node 3
            g.printNeighbors(3);
        }
    }

