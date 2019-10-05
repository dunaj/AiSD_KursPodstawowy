package pl.adulek.aisd.sorting;

public class InsertionSortRecursive {

    public static void sort(int[] arr, int firstUnsortedIndex) {
        if(firstUnsortedIndex >= arr.length)
            return;
        int newElement = arr[firstUnsortedIndex];
        int i;
        for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement ; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = newElement;
        ArrayHelper.printArray(arr);
        sort(arr, firstUnsortedIndex+1);

    }
}
