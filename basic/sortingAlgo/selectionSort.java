package sortingAlgo;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 545, 343 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = checkthemaxno(arr, last, 0);
            swap(arr, maxIndex, last);
        }
    }

    static int checkthemaxno(int arr[], int end, int start) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
