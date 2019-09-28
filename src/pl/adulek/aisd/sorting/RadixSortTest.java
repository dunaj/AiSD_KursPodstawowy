package pl.adulek.aisd.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
    int[] expected = {1330, 1594, 4586, 4725, 5729, 8792 };

    @Test
    public void sort() {
        RadixSort.sort(radixArray, 10, 4);
        System.out.println("Sorted array: ");
        ArrayHelper.printArray(radixArray);
        assertArrayEquals(expected, radixArray);
    }
}