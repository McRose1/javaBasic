package Algorithm;

/*  实现并查集算法
    用来判断一个 graph 是否存在 cycle
 */

import java.util.Arrays;

public class UnionFind {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = new int[][] {{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {2, 5}};

        // 初始化根节点数组，-1 代表该节点为根节点，起初所有节点均为自己的根节点
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        for (int[] pair : edges) {
            int x = pair[0];
            int y = pair[1];
            if (union(x, y, parent) == 0) {
                System.out.println("Cycle detected!");
                return;
            }
        }
        System.out.println("No cycle found!");
    }

    private static int find_root(int x, int[] parent) {
        // 先假定该节点为根节点
        int x_root = x;
        // 如果不是根节点，就循环找到根节点为止
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
            // 让右边的节点作为根节点
            parent[x_root] = y_root;
            return 1;
        }
    }
}
