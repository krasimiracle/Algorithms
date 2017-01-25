package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Jan-17.
 */
public class Queue {

    private int size;
    private int head;
    private int tail;
    private int[] array;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
        head = -1;
        tail = -1;
    }

    public void enqueue(int item) {
        if ((tail + 1) % size == head) {
            throw new ArrayIndexOutOfBoundsException("Queue full");
        } else if (isEmpty()) {
            head++;
            tail++;
            array[tail] = item;
        } else {
            tail = (tail + 1) % size;
            array[tail] = item;
        }
    }

    public int dequeue() {
        int value = 0;
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue");
        }
        else if(head == tail) {
            value = array[head];
            head = -1;
            tail = -1;
        }
        else {
            value = array[head];
            head = (head + 1) % size;
        }
        return value;
    }

    public boolean isEmpty() {
        return (head == -1 && tail == -1);
    }
}
