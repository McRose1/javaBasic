package Algorithm;

/*  实现并查集算法
    用来判断一个 graph 是否存在 cycle
 */

import java.util.Arrays;

public class UnionFind {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {2, 5}};

        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            if (union(x, y, parent) == 0) {
                System.out.println("Cycle detected!");
                return;
            }
        }
        System.out.println("No cycle found!");
    }

    private static int find_root(int x, int[] parent) {
        int x_root = x;
        while (parent[x_root] != -1) {
            x_root = parent[x_root];
        }
        return x_root;
    }

    private static int union(int x, int y, int[] parent) {
        int x_root = find_root(x, parent);
        int y_root = find_root(y, parent);
        if (x_root == y_root) {
            return 0;
        } else {
            parent[x_root] = y_root;
            return 1;
        }
    }
}
