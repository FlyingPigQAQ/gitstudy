package com.mmall.datastructure;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.addLast(100);
        System.out.println(linkedList);
        linkedList.add(2,200);
        System.out.println(linkedList);
    }
}
