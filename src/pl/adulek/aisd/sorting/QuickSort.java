package pl.adulek.aisd.sorting;

public class QuickSort {

    public static void sort(int[] arr, int start, int end) {
        if(end-start < 2) {
            return;
        }

        int pivot = partition(arr, start, end);
        sort(arr, start, pivot);
        sort(arr, pivot+1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arr[--j] >= pivot);
            if(i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot);
            if(i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
