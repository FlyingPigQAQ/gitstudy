package com.mmall.datastructure;

/**
 * 链表含虚拟头结点(dummyhead)
 */
public class LinkedListWithRecursion<E> {

    private Node dummyHead;
    private int size;

    public LinkedListWithRecursion() {
        this.dummyHead = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);


    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add data failed,index is wrong");
        addWithRecursion(0, index, e, dummyHead);
        size++;

    }

    private void addWithRecursion(int current, int index, E e, Node previous) {
        if (current == index) {
            previous.next = new Node(e, previous.next);
            return;
        }
        addWithRecursion(current + 1, index, e, previous.next);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur;
        for (cur = dummyHead.next; cur != null; cur = cur.next) {
            sb.append(cur.e + "-->");

        }
        sb.append("null");
        return sb.toString();
    }

    /**
     * 私有内部类
     */
    private class Node {
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
