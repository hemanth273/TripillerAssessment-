package Assesment5module14;


    import java.util.*;

    class GraphBFS {

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

            // BFS traversal from a given start node
            void BFS(int start) {
                boolean[] visited = new boolean[vertices];
                Queue<Integer> queue = new LinkedList<>();

                visited[start] = true;
                queue.add(start);

                System.out.print("BFS starting from node " + start + ": ");

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    System.out.print(node + " ");

                    for (Integer neighbor : adjList[node]) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.add(neighbor);
                        }
                    }
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

            // Perform BFS from node 0
            g.BFS(0);
        }
    }

