package Function;

/*  构建二叉树
    给定表示树的的整型数组，构建二叉树，并分别输出前序、中序、后序和层序遍历

            1
           / \
          2   3
         / \ / \
        4  5 6  7
 */

import DataStructure.TreeNode;

import java.util.*;

public class 构建二叉树 {
    public static void main(String[] args) {
        int[] tree = new int[] {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = buildTree(tree);

        // 1 2 4 5 3 6 7
        preOrderRecur(root);
        preOrderIter(root);
        System.out.println();

        // 4 2 5 1 6 3 7
        inOrderRecur(root);
        inOrderIter(root);
        System.out.println();

        // 4 5 2 6 7 3 1
        postOrderRecur(root);
        postOrderIter(root);
        System.out.println();

        levelOrderRecur(root, 0);
        for (List<Integer> list : res) {
            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        levelOrderIter(root);
        for (List<Integer> list : res) {
            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static TreeNode buildTree(int[] tree) {
        int n = tree.length;
        if (n == 1) {
            return new TreeNode(tree[0]);
        }
        List<TreeNode> list = new ArrayList<>();

        for (int j : tree) {
            list.add(new TreeNode(j));
        }

        int idx = 0;
        while (idx <= (n - 2) / 2) {
            if (idx * 2 + 1 < n) {
                list.get(idx).left = list.get(idx * 2 + 1);
            }
            if (idx * 2 + 2 < n) {
                list.get(idx).right = list.get(idx * 2 + 2);
            }
            idx++;
        }
        return list.get(0);
    }

    private static void preOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderRecur(root.left);
        preOrderRecur(root.right);
    }

    private static void preOrderIter(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.print(root.val + " ");
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
    }

    private static void inOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRecur(root.left);
        System.out.print(root.val + " ");
        inOrderRecur(root.right);
    }

    private static void inOrderIter(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    private static void postOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderRecur(root.left);
        postOrderRecur(root.right);
        System.out.print(root.val + " ");
    }

    private static void postOrderIter(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                list.add(root);
                stack.push(root);
                root = root.right;
            }
            root = stack.pop();
            root = root.left;
        }
        Collections.reverse(list);
        for (TreeNode n : list) {
            System.out.print(n.val + " ");
        }
    }

    private static List<List<Integer>> res = new ArrayList<>();

    private static void levelOrderRecur(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        levelOrderRecur(root.left, level + 1);
        levelOrderRecur(root.right, level + 1);
    }

    private static void levelOrderIter(TreeNode root) {
        if (root == null) {
            return;
        }
        res.clear();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curLevel.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(curLevel);
        }
    }
}
