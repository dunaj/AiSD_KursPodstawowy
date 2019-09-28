package pl.adulek.aisd.sorting;

public class CountingSort {

    public static void sort(int[] arr, int min, int max) {
        int[] counters = new int [max - min +1];

        for(int i = 0; i <  arr.length; ++i) {
            counters[arr[i]- min]++;
        }

        int j =0;
        for(int i = 0; i < counters.length; ++i) {
            while(counters[i] > 0) {
                arr[j++] = i+1;
                counters[i]--;
            }
        }
    }
}
