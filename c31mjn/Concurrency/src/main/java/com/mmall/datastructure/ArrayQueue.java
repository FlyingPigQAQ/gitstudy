package com.mmall.datastructure;

public class ArrayQueue<E> implements Queue<E> {
    private Array<E> arr;
    public ArrayQueue(int capacity){
        arr = new Array(capacity);
    }
    public ArrayQueue(){
        arr = new Array();
    }
    @Override
    public void enQueue(E e) {
        arr.addLast(e);

    }

    @Override
    public E deQueue() {
        return arr.removeFirst();
    }

    @Override
    public E getFront() {
        return arr.getFirst();
    }

    @Override
    public int getSize() {
        return arr.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }
    @Override
    public String  toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Queue:front[");
        for (int i = 0; i < getSize(); i++) {
            E e = arr.get(i);
            sb.append(e);
            if(i != getSize()-1){
                sb.append(",");
            }
        }
        sb.append("]bottom");
        return sb.toString();
    }
}
