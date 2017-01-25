package com.stoyanov5;

public class QueueDemo {

    public static void main(String[] args) {

        int size = 5;
        int testValue = 1;
        int testValue2 = 2;
        int testValue3 = 3;
        int testValue4 = 4;

        Queue queue = new Queue(5);

        queue.enqueue(testValue);
        queue.enqueue(testValue2);
        queue.enqueue(testValue3);
        queue.enqueue(testValue4);

        while(!queue.isEmpty()) {
            int value = queue.dequeue();
            System.out.println("Dequeued value is: " + value + " ");
        }
    }
}
