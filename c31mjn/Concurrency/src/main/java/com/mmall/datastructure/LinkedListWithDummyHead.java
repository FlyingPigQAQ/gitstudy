package com.mmall.datastructure;

/**
 * 链表含虚拟头结点(dummyhead)
 *
 */
public class LinkedListWithDummyHead<E> {

    private Node dummyHead;
    private int size;
    public LinkedListWithDummyHead(){
        this.dummyHead = new Node(null,null);
        size=0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addFirst(E e){
        add(0,e);
    }
    public void addLast(E e){
        add(size,e);


    }

    public void add(int index,E e){
        if(index<0 || index>size)
            throw  new IllegalArgumentException("Add data failed,index is wrong");
        Node prev = dummyHead ;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e,prev.next);
        size++;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur ;
        for (cur=dummyHead.next; cur!=null; cur=cur.next) {
            sb.append(cur.e+"-->");

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
