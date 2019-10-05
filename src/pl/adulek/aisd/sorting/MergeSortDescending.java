package pl.adulek.aisd.sorting;

public class MergeSortDescending {
    int[] arr = {3, 5, -22, 67, -35, 11, 1};
    public static void sort(int[] arr, int start, int end) {
        if(end - start < 2) {
            return;
        }
        int mid = (start + end)/2;
        sort(arr, start, mid);
        sort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] input = new int[end - start];
        System.arraycopy(arr, start, input, 0 , end - start);
        System.out.println("INPUT: ");
        ArrayHelper.printArray(input);


        if(arr[mid-1] >= arr[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tmpIndex=0;
        int[] tmp = new int[end - start];
        while(i < mid && j < end) {
            tmp[tmpIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start+tmpIndex ,mid - i);
        System.arraycopy(tmp, 0, arr, start, tmpIndex);


        System.out.println("ARR after step: ");
        ArrayHelper.printArray(arr);
    }
}
