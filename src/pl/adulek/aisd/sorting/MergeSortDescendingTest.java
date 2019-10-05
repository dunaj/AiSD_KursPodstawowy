package pl.adulek.aisd.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortDescendingTest {
    @Test
    public void sortTest() {
        int[] arr = {3, 5, -22, 67, -35, 11, 1};
        int[] expectedArr = {67,11,5,3,1,-22,-35};

        MergeSortDescending.sort(arr, 0, arr.length);
        System.out.println("Sorted array: ");
        ArrayHelper.printArray(arr);
        assertArrayEquals(expectedArr, arr);
    }

}