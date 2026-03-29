package Assesment5module14;

    import java.util.*;

    class GraphConnectedComponents {

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

            // DFS utility
            void DFS(int node, boolean[] visited) {
                visited[node] = true;
                for (Integer neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        DFS(neighbor, visited);
                    }
                }
            }

            // Count connected components
            int countConnectedComponents() {
                boolean[] visited = new boolean[vertices];
                int count = 0;

                for (int i = 0; i < vertices; i++) {
                    if (!visited[i]) {
                        DFS(i, visited);
                        count++;
                    }
                }
                return count;
            }
        }

        public static void main(String[] args) {
            int V = 7;
            Graph g = new Graph(V);

            // Add edges (graph with 2 connected components)
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(3, 4);
            g.addEdge(5, 6);

            // Count connected components
            System.out.println("Number of connected components: " + g.countConnectedComponents());
        }
    }

