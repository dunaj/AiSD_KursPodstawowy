package pl.adulek.aisd.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RadixSortStringTest {

    String[] radixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
    String[] expected = { "abcde", "bbbbb", "bcdef","dbaqc", "omadd" };

    @Test
    public void sort() {
        RadixSortString.sort(radixArray, 10, 4);
        System.out.println("Sorted array: ");
        ArrayHelper.printArray(radixArray);
        assertArrayEquals(expected, radixArray);
    }
}