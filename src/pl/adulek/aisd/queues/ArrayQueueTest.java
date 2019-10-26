package pl.adulek.aisd.queues;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    @Test
    public void simpleTest() {
        ArrayQueue<String> q = new ArrayQueue<>(5);
        q.add("Marek");
        q.add("Czarek");
        q.add("Darek");
        q.add("Jarek");
        q.add("Arek");
        assertEquals(q.size(), 5);
        System.out.println(q);
        assertEquals("Marek", q.peek());
        assertEquals("Marek", q.pop());
        assertEquals("Czarek", q.pop());
        assertEquals("Darek", q.pop());
        assertEquals("Jarek", q.pop());
        assertEquals("Arek", q.pop());
        assertTrue(q.isEmpty());
        assertEquals(q.size(), 0);
        System.out.println(q);
    }

    @Test
    public void circularTest() {
        ArrayQueue<String> q = new ArrayQueue<>(5);
        q.add("Marek");
        q.add("Czarek");
        q.add("Darek");
        q.add("Jarek");
        q.add("Arek");
        q.pop();
        assertEquals(4, q.size());
        q.add("Brajan");
        System.out.println(q);
        assertEquals("Czarek", q.peek());
        assertEquals(5, q.size());
        q.add("Nadmiarowy Janusz");
        System.out.println(q);
        assertEquals("Czarek", q.pop());
        assertEquals(5, q.size());
        System.out.println(q);

    }
}