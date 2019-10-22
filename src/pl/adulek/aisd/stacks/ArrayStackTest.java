package pl.adulek.aisd.stacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack<String> stack;

    @Before
    public void setupStack() {
        stack = new ArrayStack<>(10);
        stack.push("adulek");
        stack.push("bzin");
        stack.push("krauzega");
        stack.push("twaro");

    }

    @Test
    public void pushTest() {
        stack.push("adi");
        assertEquals("The last pushed string should be", "adi", stack.pop());
    }

    @Test
    public void popTest() {
        assertEquals("twaro", stack.pop());
        assertEquals("krauzega", stack.pop());
    }

    @Test
    public void peekTest() {
        assertEquals("twaro", stack.peek());
    }
}