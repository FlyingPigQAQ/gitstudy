package com.mmall.datastructure;

import java.util.Random;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
//        Random random = new Random();
//        for (int i = 0; i < 8; i++) {
//            tree.add(random.nextInt(10));
//        }
        int[] ints = {5, 3, 8, 1, 4, 6, 10, 9};
        for (int i :
                ints) {
            tree.add(i);
        }
//        System.out.println("前序遍历-递归");
//        tree.preOrder();
//        System.out.println("中序遍历-递归");
//        tree.inOrder();
//        System.out.println("后序遍历-递归");
//        tree.postOrder();
//        System.out.println("前序遍历-非递归(栈)");
//        tree.preOrderNR();
//        System.out.println("层序遍历-队列");
//        tree.levelOrder();
//        System.out.println("获取最小值-递归");
//        System.out.println(tree.minimum());
//        System.out.println("获取最大值-递归");
//        System.out.println(tree.maximum());
//        System.out.println("删除最小数");
//        Integer min = tree.removeMin();
//        System.out.println(min);
//        System.out.println("前序遍历-递归");
//        tree.preOrder();
//
//        System.out.println("删除最大数");
//        Integer max = tree.removeMax();
//        System.out.println(max);
//        System.out.println("前序遍历-递归");
//        tree.preOrder();
        System.out.println("Size:" + tree.getSize());
        tree.remove(8);
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println("Size:" + tree.getSize());

    }

}
