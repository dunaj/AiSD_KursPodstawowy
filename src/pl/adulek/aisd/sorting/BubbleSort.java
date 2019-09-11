package pl.adulek.aisd.sorting;

public class BubbleSort {

    public static void sort(int[] arr) {
        for(int sortedPartBegin = arr.length-1; sortedPartBegin > 0; sortedPartBegin--) {
            for(int i = 0; i <  sortedPartBegin; ++i) {
                if(arr[i] > arr[i+1]) {
                    ArrayHelper.swap(arr, i, i+1);
                }
            }
        }
    }
}
