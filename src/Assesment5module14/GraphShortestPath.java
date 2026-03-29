package Assesment5module14;

    import java.util.*;

    class GraphShortestPath {

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

            // BFS to find shortest path from start node
            void shortestPathBFS(int start) {
                int[] distance = new int[vertices];
                Arrays.fill(distance, -1); // -1 indicates unreachable
                boolean[] visited = new boolean[vertices];

                Queue<Integer> queue = new LinkedList<>();
                visited[start] = true;
                distance[start] = 0;
                queue.add(start);

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (Integer neighbor : adjList[node]) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            distance[neighbor] = distance[node] + 1;
                            queue.add(neighbor);
                        }
                    }
                }

                // Print shortest distances
                System.out.println("Shortest distances from node " + start + ":");
                for (int i = 0; i < vertices; i++) {
                    System.out.println("Node " + i + " -> " + distance[i]);
                }
            }
        }

        public static void main(String[] args) {
            int V = 6;
            Graph g = new Graph(V);

            // Add edges
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 3);
            g.addEdge(2, 3);
            g.addEdge(3, 4);
            g.addEdge(4, 5);

            // Find shortest path from node 0
            g.shortestPathBFS(0);
        }
    }
