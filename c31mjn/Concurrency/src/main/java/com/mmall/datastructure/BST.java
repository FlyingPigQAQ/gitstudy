package com.mmall.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST<E extends Comparable<E>> {
    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }


    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    public void add(E e) {
        root = add(root, e);
    }
    public int getSize(){
        return size;
    }

    //递归添加
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    //查找某元素
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            return contains(node.right, e);
        } else {
            return true;
        }
    }

    //前序遍历
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        //打印当前节点
        System.out.println(node);
        //遍历左子树
        preOrder(node.left);
        //遍历右子树
        preOrder(node.right);
    }

    //中序遍历
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        //遍历左子树
        inOrder(node.left);
        //打印当前节点
        System.out.println(node);
        //遍历右子树
        inOrder(node.right);
    }

    //后序遍历
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;

        //遍历左子树
        postOrder(node.left);

        //遍历右子树
        postOrder(node.right);

        //打印当前节点
        System.out.println(node);
    }

    //二分搜索树非递归的前序遍历
    //使用栈来模拟系统栈
    public void preOrderNR(){
        if(root==null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            //出栈，打印当前节点
            Node node = stack.pop();
            System.out.println(node);
            //栈的特点是LIFO，为满足前序遍历特点应该先入栈右节点，再入栈左节点
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
            stack.push(node.left);

        }
    }
    //层序遍历
    public void levelOrder(){
        if(root==null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }

    }
    //获取二分搜索树的最小值
    public E minimum(){
        if(size==0)
            throw new IllegalArgumentException("BST is empty");
        Node minNode = minimum(root);
        return minNode.e;
    }
    //返回值最小节点
    private Node minimum(Node node){

        if(node.left==null){
            return node;
        }

        return minimum(node.left);
    }
    //删除最小值
    public E removeMin(){
        E ret = minimum();
        root = removeMin(root);
        size--;
        return ret;

    }
    //返回删除树后的根节点
    private Node removeMin(Node node){
        if(node.left==null){
            Node rightNode = node.right;
            node.right=null;
            return rightNode;
        }
        node.left=removeMin(node.left);
        return node;
    }
    //删除最大值
    public E removeMax(){
        E ret = maximum();
        root = removeMax(root);
        size--;
        return ret;
    }
    private Node removeMax(Node node){
        if(node.right==null){
            Node leftNode = node.left;
            node.left=null;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }
    //获取二分搜索树的最大值
    public E maximum(){
        if(size==0)
            throw  new IllegalArgumentException("BST is empty");
        Node maxNode = maximum(root);
        return maxNode.e;
    }
    //获取二分搜索树的值最大节点
    private Node maximum(Node node){
        if(node.right==null)
            return node;
        return maximum(node.right);
    }

    public void remove(E e){
        if(size==0){
            throw new IllegalArgumentException("BST is empty");
        }
        root = remove(root,e);
        size--;
    }
    private Node remove(Node node ,E e ){
        if(node==null){
            return null;
        }
        if(e.compareTo(node.e)<0){
            node.left = remove(node.left,e);
            return node;
        }else if(e.compareTo(node.e)>0){
            node.right = remove(node.right,e);
            return node;
        }else{
            Node leftNode = node.left;
            Node rightNode = node.right;
            node.left=null;
            node.right=null;
            //左子树为空，右子树不为空
            if(leftNode==null && rightNode!=null)
                return  rightNode;

            //左子树不为空，右子树为空
            if(leftNode!=null && rightNode==null)
                return  leftNode;

            //左右子树均不为空
            //查找右子树的最小节点，并替换到当前节点(或者查找左子树的最大节点，替换到当前节点)
            Node replaceNode = minimum(rightNode);
            //先执行删除，再执行赋值，否则会死循环
            replaceNode.right = removeMin(rightNode);

            replaceNode.left = leftNode;

            return replaceNode;




        }
    }
}
