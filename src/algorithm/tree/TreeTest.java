package algorithm.tree;

import java.util.*;

public class TreeTest {
    public static int getNodeNum(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return getNodeNum(root.left) + getNodeNum(root.right) + 1;
    }

    public static int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    static List<Integer> preOrderReverse(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    static void preOrder(TreeNode root, List<Integer> result) {
        if (null == root) return;
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    static void inOrder(TreeNode root, List<Integer> result) {
        if (null == root) return;
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    static List<Integer> preOrderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (null == root) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur;
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int l = queue.size();
            //noinspection Duplicates
            for (int i = 0; i < l; i++) {
                cur = queue.poll();
                level.add(cur.val);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            res.add(level);
        }
        return res;
    }

    static List<List<Integer>> levelReverseOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur;
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int l = queue.size();
            //noinspection Duplicates
            for (int i = 0; i < l; i++) {
                cur = queue.poll();
                level.add(cur.val);
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            res.add(0, level);
        }
        return res;
    }

    static int getKlevelNumber(TreeNode root, int k) {
        if (null == root || k <= 0) return 0;
        if (null != root && k == 1) return 1;
        return getKlevelNumber(root.left, k - 1) + getKlevelNumber(root.right, k - 1);
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) return true;
        if (null == p || null == q) return false;
        if (p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }

    static TreeNode invertTree(TreeNode root) {
        if (null == root) return root;
        TreeNode node = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(node);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        System.out.println(levelReverseOrder(root));
    }
}
