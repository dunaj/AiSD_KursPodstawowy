package pl.adulek.aisd.sorting;

public class SelectionSort {

    public static void sort(int[] arr) {
        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i =1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            ArrayHelper.swap(arr, lastUnsortedIndex, largest);
        }
    }
}
