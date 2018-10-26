package com.mmall.leetcode;

class BinaryTreeMaxDepth {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode root;
    private int size;
    public int maxDepth(){
        return maxDepth(root);
    }
    private int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public void add(int x){
        root = add(root,x);

    }
    private TreeNode add(TreeNode node,int x){
        if(node==null){
            size++;
            return new TreeNode(x);
        }
        if(x<node.val){
            node.left = add(node.left,x);
        }
        if(x>node.val){
            node.right=add(node.right,x);
        }
        return node;
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();
        int[] ints = {3,9,20,15,7};
        for (int x :
                ints) {
            tree.add(x);
        }
        System.out.println(tree.maxDepth());
    }


}
