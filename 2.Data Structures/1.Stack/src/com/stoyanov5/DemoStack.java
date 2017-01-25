package com.stoyanov5;

public class DemoStack {

    public static void main(String[] args) {

        int stackSize = 5;
        int testElement = 1;
        int testElement2 = 2;
        int testElement3 = 3;
        int testElement4 = 4;

        Stack stack = new Stack(stackSize);
        stack.push(testElement);
        stack.push(testElement2);
        stack.push(testElement3);
        stack.push(testElement4);

        System.out.println("Stack peek: " + stack.peek());

        while(!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("Popped value is: " + value + " ");
        }
        System.out.println();
    }
}
