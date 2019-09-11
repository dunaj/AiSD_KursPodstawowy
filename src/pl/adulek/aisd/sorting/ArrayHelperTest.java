package pl.adulek.aisd.sorting;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class ArrayHelperTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @org.junit.Test
    public void printArray() {
        int[] arr = {1,2,3,4,5};
        ArrayHelper.printArray(arr);
        assertEquals("{1, 2, 3, 4, 5}\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }
}