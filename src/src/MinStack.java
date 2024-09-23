package src;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int value = stack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
    }

    public int min() {
        if (minStack.isEmpty()) throw new IllegalStateException("Stack is empty");
        return minStack.peek();
    }
}

