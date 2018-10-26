package com.mmall.datastructure;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> arr = new ArrayStack<>(10);
        for (int i = 0; i < 11; i++) {
            arr.push(i);
            System.out.println(arr);
        }
        arr.pop();
        System.out.println(arr);
    }
}
