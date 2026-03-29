package Assesment5module14;

    import java.util.*;

    class GraphCycle {

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


            void addEdge(int src, int dest) {
                adjList[src].add(dest);
                adjList[dest].add(src);
            }


            boolean isCyclicUtil(int node, boolean[] visited, int parent) {
                visited[node] = true;

                for (Integer neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        if (isCyclicUtil(neighbor, visited, node))
                            return true;
                    } else if (neighbor != parent) {
                        return true; // Found a back edge
                    }
                }
                return false;
            }

            boolean hasCycle() {
                boolean[] visited = new boolean[vertices];

                for (int i = 0; i < vertices; i++) {
                    if (!visited[i]) {
                        if (isCyclicUtil(i, visited, -1))
                            return true;
                    }
                }
                return false;
            }
        }

        public static void main(String[] args) {
            int V = 5;
            Graph g = new Graph(V);


            g.addEdge(0, 1);
            g.addEdge(0, 4);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(1, 4);
            g.addEdge(2, 3);
            g.addEdge(3, 4);

            if (g.hasCycle())
                System.out.println("The graph has a cycle");
            else
                System.out.println("The graph does NOT have a cycle");
        }
    }

