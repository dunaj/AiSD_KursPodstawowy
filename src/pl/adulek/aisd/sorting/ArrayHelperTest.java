package pl.adulek.aisd.sorting;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class ArrayHelperTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printArray() {
        int[] arr = {1,2,3,4,5};
        ArrayHelper.printArray(arr);
        assertEquals("{1, 2, 3, 4, 5}\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void swapTest() {
        int[] arr = {3, 5, -22, 67, -35, 11, 1};
        ArrayHelper.swap(arr, 0,1);
        assertEquals(5, arr[0]);
        assertEquals(3, arr[1]);
    }

    @Test
    public void swapTestSwapSameIndices() {
        int[] arr = {3, 5, -22, 67, -35, 11, 1};
        int[] expectedArrNotChanged = {3, 5, -22, 67, -35, 11, 1};
        ArrayHelper.swap(arr, 0,0);
        assertArrayEquals(expectedArrNotChanged , arr);
    }

    @Test
    public void printStringArray() {
        String[] arr = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        ArrayHelper.printArray(arr);
        assertEquals("{bcdef, dbaqc, abcde, omadd, bbbbb}\n",
                systemOutRule.getLogWithNormalizedLineSeparator());
    }
}