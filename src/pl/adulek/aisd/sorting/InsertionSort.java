package pl.adulek.aisd.sorting;

public class InsertionSort {

    public static void sort(int[] arr) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement ; i--) {
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;
        }

    }
}
