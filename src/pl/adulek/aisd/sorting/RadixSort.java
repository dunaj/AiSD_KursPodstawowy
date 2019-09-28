package pl.adulek.aisd.sorting;

public class RadixSort {

    public static void sort(int[] arr, int radix, int width) {
        for(int i = 0; i < width; ++i) {
            radixSingleSort(arr, i, radix);
        }
    }

    private static void radixSingleSort(int[] arr, int position, int radix) {
        int[] countArray = new int[radix];
        for (int i = 0; i < arr.length; ++i) {
            countArray[digitAtPosition(arr[i], position, radix)]++;
        }
        for(int i = 1; i < countArray.length; ++i) {
            countArray[i] += countArray[i-1];
        }
        int[] tmpArray = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--) {
            int digitAtPosition = digitAtPosition(arr[i], position, radix);
            tmpArray[--countArray[digitAtPosition]] = arr[i];
        }

        System.arraycopy(tmpArray, 0, arr, 0, arr.length);

    }

    private static int digitAtPosition(int number, int position, int radix) {
        int divisor =(int) Math.pow(radix, position);
        return number / divisor % radix;
    }
}
