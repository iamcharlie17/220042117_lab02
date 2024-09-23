package test;

import org.junit.Test;
import src.MinStack;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals(1, minStack.min());

        minStack.pop();
        assertEquals(2, minStack.min());

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        assertEquals(1, minStack.min());
    }
}

