package com.mmall.datastructure;

/**
 * 链表含虚拟头结点(dummyhead)
 */
public class LinkedListWithRecursionTest<E> {

    public static void main(String[] args) {
        LinkedListWithRecursion<Integer> linkedList = new LinkedListWithRecursion<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addFirst(i);
            System.out.println("size:"+linkedList.getSize());
            System.out.println(linkedList);
        }
        linkedList.addLast(100);
        System.out.println(linkedList);
        linkedList.add(2,200);
        System.out.println(linkedList);
    }
}
