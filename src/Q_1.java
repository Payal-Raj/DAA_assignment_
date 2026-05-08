import java.util.ArrayList;
import java.util.LinkedList;

public class Q_1 {
    // ─── 1. Adjacency List ────────────────────────────────────
    static void adjacencyList(int vertices) {
        ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++)
            adjList.add(new LinkedList<>());

        for (int i = 0; i < vertices; i++)
            for (int j = 0; j < vertices; j++)
                if (i != j)
                    adjList.get(i).add(j);

        System.out.println("\n[1] Adjacency List:");
        System.out.println("  Vertex : Neighbors");
        for (int i = 0; i < vertices; i++)
            System.out.println("    " + i + "    : " + adjList.get(i));
    }

    // ─── 2. Adjacency Matrix ──────────────────────────────────
    static void adjacencyMatrix(int vertices) {
        int[][] matrix = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++)
            for (int j = 0; j < vertices; j++)
                if (i != j)
                    matrix[i][j] = 1;

        System.out.println("\n[2] Adjacency Matrix:");
        System.out.print("     ");
        for (int j = 0; j < vertices; j++){
            System.out.print(j + "  ");
        }
        System.out.println();
        for (int i = 0; i < vertices; i++) {
            System.out.print("  " + i + "  ");
            for (int j = 0; j < vertices; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    // ─── 3. Edge List (third format — extra) ─────────────────
    static void edgeList(int vertices) {
        ArrayList<int[]> edges = new ArrayList<>();
        for (int i = 0; i < vertices; i++)
            for (int j = i + 1; j < vertices; j++)
                edges.add(new int[]{i, j});

        System.out.println("\n[3] Edge List");
        System.out.print("  Edges: ");
        for (int[] e : edges)
            System.out.print("(" + e[0] + "," + e[1] + ") ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("  Q1: GRAPH REPRESENTATION — 4-Vertex Complete Graph");
        int vertices = 4;
        adjacencyList(vertices);
        adjacencyMatrix(vertices);
        edgeList(vertices);

    }
}