package Assesment5module14;

    import java.util.*;

    class GraphCount {

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

            // Count vertices
            int countVertices() {
                return vertices;
            }

            // Count edges
            int countEdges() {
                int edgeCount = 0;
                for (int i = 0; i < vertices; i++) {
                    edgeCount += adjList[i].size();
                }
                return edgeCount / 2; // Each edge counted twice in undirected graph
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

            System.out.println("Number of vertices: " + g.countVertices());
            System.out.println("Number of edges: " + g.countEdges());
        }
    }

