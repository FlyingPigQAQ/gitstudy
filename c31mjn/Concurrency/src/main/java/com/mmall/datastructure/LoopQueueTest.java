package com.mmall.datastructure;

public class LoopQueueTest {
    public static void main(String[] args) {
        LoopQueue<Integer> arr = new LoopQueue<>(10);
        for (int i = 0; i < 15; i++) {
            arr.enQueue(i);
            System.out.println(arr);
            if(i%3==2){
                arr.deQueue();
                System.out.println(arr);
            }
        }

    }
}
