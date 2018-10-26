package com.mmall.datastructure;

public class ArrayStack<E> implements Stack<E> {
    private Array<E> arr;

    public ArrayStack(int capacity) {
        arr = new Array<>(capacity);
    }

    public ArrayStack() {
        arr = new Array<>();
    }

    @Override
    public void push(E e) {
        arr.addLast(e);
    }

    @Override
    public E pop() {
        return arr.removeLast();
    }

    @Override
    public E peek() {
        return arr.getLast();
    }

    @Override
    public int getSize() {
        return arr.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public int getCapacity() {
        return arr.getCapacity();
    }
    @Override
    public String  toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < getSize(); i++) {
            E e = arr.get(i);
            sb.append(e);
            if(i != getSize()-1){
                sb.append(",");
            }
        }
        sb.append("]top");
        return sb.toString();
    }
}
