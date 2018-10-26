package com.mmall.datastructure;

/**
 * 链表不含虚拟头结点(dummyhead)
 *
 */
public class LinkedList<E> {

    private Node head;
    private int size;

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addFirst(E e){
        head = new Node(e, head);
        size++;
    }
    public void addLast(E e){
        add(size,e);


    }

    public void add(int index,E e){
        if(index<0 || index>size)
            throw  new IllegalArgumentException("Add data failed,index is wrong");
        if(index==0)
            addFirst(e);
        else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = new Node(e,prev.next);
            size++;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node prev ;
        for (prev=head; prev!=null; prev=prev.next) {
            sb.append(prev.e+"-->");

        }
        sb.append("null");
        return sb.toString();
    }

    /**
     * 私有内部类
     */
    private class Node{
        private E e;
        private Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }
}
