package com.mmall.datastructure;

import java.util.Arrays;

/**
 * O(n) O代表渐进时间复杂度，n趋于无穷大
 * 空间复杂度
 * 均摊复杂度
 * 复杂度动荡
 *
 * @param <E>
 */
public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造capacity大小的数组
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 空参构造器，默认构造大小为10的数组
     */
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed,index wrong");
        if (size == data.length) {
            resize(data.length * 2);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
//        E[] newArr = (E[]) new Object[newCapacity];
//        for (int i = 0; i < size; i++) {
//            newArr[i]=data[i];
//        }
//        data=newArr;
        data = Arrays.copyOf(data, newCapacity);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    //返回元素所在的索引，没有返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed,index wrong");
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];

        }
        size--;
        if (size <= data.length / 4 && data.length/2!=0) {
            resize(data.length / 2);
        }
        return ret;
    }

    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }


    public E get(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Get failed,index wrong");
        return data[index];

    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed,index wrong");
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array:size=%d,capacity=%d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();

    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }
}
