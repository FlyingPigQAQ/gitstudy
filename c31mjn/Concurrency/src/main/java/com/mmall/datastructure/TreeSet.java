package com.mmall.datastructure;

public class TreeSet<E extends Comparable<E>> implements Set<E> {

    class Node {
        public E val;
        public Node left;
        public Node right;

        public Node(E val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return val.toString();
        }
    }

    private int size;
    private Node root;

    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E value) {
        if (isEmpty()) {
            throw new IllegalArgumentException("TreeSet is empty");
        }
        Node cur = root;
        while (cur != null) {
            if (value.compareTo(cur.val) == 0) {
                return true;
            } else if (value.compareTo(cur.val) <= 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }

        }
        return false;
    }

    @Override
    public void add(E value) {
        root = add(root, value);
    }

    private Node add(Node node, E value) {
        if (node == null) {
            size++;
            return new Node(value);
        }
        if (value.compareTo(node.val) < 0) {
            node.left = add(node.left, value);
        } else if (value.compareTo(node.val) > 0) {
            node.right = add(node.right, value);
        }
        return node;
    }

    public E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("Tree set is empty");
        }
        return minimum(root).val;
    }

    private Node minimum(Node node) {
        Node cur = node;
        while (cur != null) {
            if (cur.left != null) {
                cur = cur.left;
            } else {
                return cur;
            }
        }
        return null;
    }

    private Node removeMinimum(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left = removeMinimum(root.left);
        } else {
            size--;
            return root.right;
        }
        return root;

    }
    public E removeMinimum(){
        E minimum = minimum();
        root = removeMinimum(root);
        return minimum;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void remove(E value) {
        root = remove(root,value);

    }
    private Node remove(Node node,E value){
        if(node==null){
            return null;
        }

        if(value.compareTo(node.val)==0){
            size--;
            if(node.left!=null && node.right==null){
                Node leftNode = node.left;
                node.left=null;

                return leftNode;
            }
            if(node.left==null && node.right!=null){
                Node rightNode = node.right;
                node.right=null;
                return rightNode;
            }
            if(node.left!=null && node.right!=null){
                Node minimum = minimum(node.right);
                minimum.right=removeMinimum(node.right);
                minimum.left=node.left;

                node.left=null;
                node.right=null;

                return minimum;
            }

            if(node.left==null && node.right==null){
                return null;
            }


        }else if(value.compareTo(node.val)<0){
            node.left = remove(node.left,value);
        }else{
            node.right = remove(node.right,value);
        }
        return node;
    }

    public static void main(String[] args) {
        TreeSet<Integer> sets = new TreeSet<>();
        int[] ints = {5, 3, 8, 1, 4, 6, 10, 9};
        for (int i : ints) {
            sets.add(i);
        }
        sets.preOrder();
        System.out.println();
        sets.remove(8);
        sets.preOrder();

    }
}
