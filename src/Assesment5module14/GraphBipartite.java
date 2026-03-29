package Assesment5module14;

    import java.util.*;

    class GraphBipartite {

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

            // Check if the graph is bipartite using BFS
            boolean isBipartite() {
                int[] color = new int[vertices];
                Arrays.fill(color, -1); // -1 = uncolored

                for (int start = 0; start < vertices; start++) {
                    if (color[start] == -1) {
                        if (!bfsCheck(start, color))
                            return false;
                    }
                }
                return true;
            }

            // BFS check from a node
            boolean bfsCheck(int start, int[] color) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                color[start] = 0; // Start with color 0

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (Integer neighbor : adjList[node]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node]; // Assign opposite color
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[node]) {
                            return false; // Same color on adjacent nodes
                        }
                    }
                }
                return true;
            }
        }

        public static void main(String[] args) {
            int V = 4;
            Graph g = new Graph(V);

            // Add edges
            g.addEdge(0, 1);
            g.addEdge(0, 3);
            g.addEdge(1, 2);
            g.addEdge(2, 3);

            // Check if bipartite
            if (g.isBipartite())
                System.out.println("The graph is bipartite");
            else
                System.out.println("The graph is NOT bipartite");
        }
    }

