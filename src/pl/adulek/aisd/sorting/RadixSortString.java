package pl.adulek.aisd.sorting;

public class RadixSortString {

    public static void sort(String[] arr, int radix, int width) {
        for(int i = width-1; i>= 0; --i) {
            radixSingleSort(arr, i, radix);
        }
    }

    private static void radixSingleSort(String[] arr, int position, int radix) {
        int[] countArray = new int['z'-'a'+1];
        for (int i = 0; i < arr.length; ++i) {
            countArray[arr[i].charAt(position)-'a']++;
        }
        for(int i = 1; i < countArray.length; ++i) {
            countArray[i] += countArray[i-1];
        }
        String[] tmpArray = new String[arr.length];
        for(int i = arr.length-1; i>=0; i--) {
            int digitAtPosition = arr[i].charAt(position)-'a';
            tmpArray[--countArray[digitAtPosition]] = arr[i];

        }

        System.arraycopy(tmpArray, 0, arr, 0, arr.length);

    }

//    private static int digitAtPosition(int number, int position, int radix) {
//        int divisor =(int) Math.pow(radix, position);
//        return number / divisor % radix;
//    }
}
