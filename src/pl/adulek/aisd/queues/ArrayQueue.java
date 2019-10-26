package pl.adulek.aisd.queues;

import java.util.NoSuchElementException;

public class ArrayQueue <T> {
    private Object[] queue;
    private int begin;
    private int end;

    public ArrayQueue(int capacity) {
        queue = new Object[capacity];
    }

    public ArrayQueue() {
        this(10);
    }

    public void add(T elem) {
        if(size()  == queue.length) {
            Object[] newArr = new Object[2 * queue.length];
            if(end > begin) {
                System.arraycopy(queue, begin, newArr, begin, end - begin);
            } else {
                System.arraycopy(queue, end, newArr, 0, queue.length - end);
                System.arraycopy(queue, 0, newArr, queue.length - end, begin);
            }
            queue = newArr;
            begin = 0;
            end = queue.length/2;
        }
        if (end < queue.length) {
            queue[end++] = elem;
        } else {
            end = 1;
            queue[0] = elem;
        }
    }

    public T pop() {
        if(isEmpty()) {
            throw new NoSuchElementException("The queue is empty!");
        }
        T returningElement = (T) queue[begin];
        queue[begin] = null;
        if(begin == queue.length-1) {
            if (queue.length == end) {
                begin = 0;
                end = 0;
            } else {
                begin = 0;
            }
        } else {
            begin++;
        }

        return returningElement;
    }

    public T peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("The queue is empty!");
        }
        return (T) queue[begin];
    }

    public int size() {
        if (begin == end) {
            if (queue[begin] == null) {
                return 0;
            } else {
                return queue.length;
            }
        }
        if (end > begin) {
            return end - begin;
        } else {
            return queue.length - begin + end;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== QUEUE: ======\n");
        sb.append("begin = " + begin + "; end = "+end + ";\n");
        for(int i = 0; i < queue.length; ++i) {
            sb.append("Position " + i + ": " + (T)queue[i] + "\n");
        }
        sb.append("===== QUEUE-END ======\n");
        return sb.toString();
    }
}
