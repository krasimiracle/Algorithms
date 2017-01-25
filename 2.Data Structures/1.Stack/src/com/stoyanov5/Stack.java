package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Jan-17.
 */
public class Stack {

    private int maxLength;
    private int top;
    private int[] array;

    public Stack(int max) {
        this.maxLength = max;
        this.top = -1;
        this.array = new int[max];
    }

    public void push(int item) {
        array[++top] = item;
    }

    public int pop() {
        return array[top--];
    }

    /**
     * Returns the most recently added item.
     * @return int value of the most recently added item
     */
    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxLength - 1);
    }
}
