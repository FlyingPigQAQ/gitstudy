package com.mmall.datastructure;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<Integer> arr = new ArrayQueue<>(10);
        for (int i = 0; i < 10; i++) {
            arr.enQueue(i);
            System.out.println(arr);
            if(i%3==2){
                arr.deQueue();
                System.out.println(arr);
            }
        }

    }
}
