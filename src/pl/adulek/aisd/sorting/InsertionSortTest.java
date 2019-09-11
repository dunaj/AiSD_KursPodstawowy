package pl.adulek.aisd.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sortTest() {
        int[] arr = {3, 5, -22, 67, -35, 11, 1};
        int[] expectedArr = {-35, -22, 1, 3, 5, 11, 67};

        InsertionSort.sort(arr);
        System.out.println("Sorted array: ");
        ArrayHelper.printArray(arr);
        assertArrayEquals(expectedArr, arr);
    }

}