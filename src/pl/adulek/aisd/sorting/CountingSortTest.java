package pl.adulek.aisd.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingSortTest {

    @Test
    public void testSort() {
        int [] arr =  {10, 8, 5, 9 , 3, 1, 3, 3, 8, 8, 1, 2};
        int [] expected = {1,1, 2, 3, 3, 3, 5, 8, 8, 8, 9, 10};

        CountingSort.sort(arr, 1, 10);

        assertArrayEquals(expected, arr);
    }
}