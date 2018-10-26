package com.mmall.leetcode;

import java.util.HashMap;
import java.util.Map;


public class MaxWidth {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int ans;
    Map<Integer, Integer> left;

    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap();
        dfs(root, 0, 0);
        return ans;
    }

    public void dfs(TreeNode root, int depth, int pos) {
        if (root == null) return;
        left.computeIfAbsent(depth, x -> pos);
        ans = Math.max(ans, pos - left.get(depth) + 1);
        dfs(root.left, depth + 1, 2 * pos);
        dfs(root.right, depth + 1, 2 * pos + 1);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t33 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        t1.left = t3;
        t1.right = t2;
        t3.left = t5;
        t3.right = t33;
        t2.right = t9;
        MaxWidth tree = new MaxWidth();
        int i = tree.widthOfBinaryTree(t1);
        System.out.println(i);
    }
}
