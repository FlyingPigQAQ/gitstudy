package com.mmall.datastructure;

public interface Set<E> {
    int getSize();
    boolean isEmpty();
    boolean contains(E value);
    void add(E value);
    void remove(E value);
}
