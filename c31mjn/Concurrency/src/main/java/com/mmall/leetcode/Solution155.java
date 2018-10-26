package com.mmall.leetcode;

import java.util.Stack;

public class Solution155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.top();
        System.out.println(minStack.getMin());

        minStack.top();
        System.out.println(minStack.getMin());
        minStack.top();
    }
}

class MinStack {
    private Integer min;
    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        min = 0;
    }

    public void push(int x) {
        stack.push(x);
        if(stack.size()==1){
            min=stack.get(0);
        }
        if (min > x) {
            min = x;
        }
    }

    public void pop() {

        Integer element = stack.pop();
        if (stack.isEmpty()) {
            min = null;
            return;
        }
        if (element.equals(min)) {
            int minTemp = stack.get(0);
            for (int i = 1; i < stack.size(); i++) {
                int e = stack.get(i);
                if (e < minTemp) {
                    minTemp = e;
                }
            }
            min = minTemp;

        }
    }

    public int top() {
        checkStack();
        return stack.peek();
    }
    //Time Limit Exceeded

    public int getMin1() {
        if (stack.isEmpty())
            throw new IllegalArgumentException("Stack is null");
        int min = stack.get(0);
        for (int i = 1; i < stack.size(); i++) {
            int e = stack.get(i);
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    public int getMin() {
        checkStack();
        return min;
    }

    private void checkStack() {
        if (stack.isEmpty())
            throw new IllegalArgumentException("Stack is null");
    }


}