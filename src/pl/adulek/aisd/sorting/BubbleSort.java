package pl.adulek.aisd.sorting;

public class BubbleSort {

    public static void sort(int[] arr) {
        for(int lastUnsortedElement = arr.length-1; lastUnsortedElement > 0; lastUnsortedElement--) {
            for(int i = 0; i <  lastUnsortedElement; ++i) {
                if(arr[i] > arr[i+1]) {
                    ArrayHelper.swap(arr, i, i+1);
                }
            }
        }
    }
}

