package Assesment5module14;


    import java.util.*;

    class GraphDFS {

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

            // DFS utility function (recursive)
            void DFSUtil(int node, boolean[] visited) {
                visited[node] = true;
                System.out.print(node + " ");

                for (Integer neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        DFSUtil(neighbor, visited);
                    }
                }
            }

            // DFS traversal starting from a given node
            void DFS(int start) {
                boolean[] visited = new boolean[vertices];
                System.out.print("DFS starting from node " + start + ": ");
                DFSUtil(start, visited);
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

            // Perform DFS from node 0
            g.DFS(0);
        }
    }

