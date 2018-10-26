package com.mmall.datastructure;

public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(20);
        for (int i = 0; i < 20; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        arr.removeLast();
        System.out.println(arr);
        arr.removeElement(6);
        System.out.println(arr);

        int[] ints = new int[0]; //无意义
        System.out.println(1/3);
        //int[] ints1 = new int[0.5]; 数组里只能存放整型个数，不能存放浮点数

    }
}
