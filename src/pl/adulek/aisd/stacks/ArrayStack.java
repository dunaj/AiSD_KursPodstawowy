package pl.adulek.aisd.stacks;

public class ArrayStack<E> {
    private Object[] stack;
    private int top;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack(int capacity) {
        stack = new Object[capacity];
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public void push(E elem) {
        if(top == stack.length) {
            Object[] newArr = new Object[2*stack.length];
            System.arraycopy(stack, 0, newArr, 0, stack.length);
            stack = newArr;
        }
        stack[top++] = elem;
    }

    public E pop() {
        if(top == 0) {
            return null;
        }
        Object returnedElem = stack[top-1];
        stack[top--] = null;
        return (E) returnedElem;
    }

    public E peek() {
        if(top == 0) {
            return null;
        }
        return (E)stack[top-1];
    }

    public void printStack() {
        for(int i = top-1; i>=0; --i) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }


}
