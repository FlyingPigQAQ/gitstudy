package com.mmall.datastructure;

import com.mmall.FileOperation;

import java.util.ArrayList;

public class LinkedListSet<E> implements Set<E>{

    class Node{
        public E val;
        public Node next;
        public Node(E val){
            this(val,null);
        }
        public Node(E val,Node node){
            this.val = val;
            this.next = node;
        }
        @Override
        public String toString(){
            return val.toString();
        }
    }

    private int size;
    private Node dummyNode;

    public LinkedListSet(){
        size=0;
        dummyNode = new Node(null,null);

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(E value) {
        if(value==null){
            throw new IllegalArgumentException("Value could not be null");
        }
        Node cur = dummyNode.next;
        while (cur!=null){
            if(value.equals(cur.val)){
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }



    @Override
    public void add(E value) {
        if(!contains(value)){
            dummyNode.next=new Node(value,dummyNode.next);
            size++;
        }

    }

    @Override
    public void remove(E value) {
        if(dummyNode.next==null){
            throw  new IllegalArgumentException("Set is empty");
        }
        dummyNode.next = remove(dummyNode.next,value);

    }
    private Node remove(Node node,E value){
        if(node==null){
            return null;
        }

        if(value.equals(node.val)){
            size--;
            return node.next;
        }else{
            node.next = remove(node.next,value);
            return node;
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node cur = dummyNode.next;
        while(cur!=null){
            sb.append(cur.val+"=>");
            cur = cur.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListSet<String> ls = new LinkedListSet<>();
        ArrayList<String> al = new ArrayList<>();

        boolean b = FileOperation.readFile("/Users/tobbyquinn/learning/gitstudy/c31mjn/Concurrency" +
                "/target/classes/pride-and-prejudice.txt", al);
        System.out.println(b);
        System.out.println("Total words:"+al.size());
        double startTime = System.nanoTime();
        FileOperation.readFile("/Users/tobbyquinn/learning/gitstudy/c31mjn/" +
                "Concurrency/target/classes/pride-and-prejudice.txt",ls);
        System.out.println("Different words:"+ls.getSize());
        double endTime = System.nanoTime();
        System.out.println("耗时："+(endTime-startTime)/1000000000+"秒");

    }
}
