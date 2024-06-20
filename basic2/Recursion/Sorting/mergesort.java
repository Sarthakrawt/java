
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 4, 54, 6 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        // this will divide the array into two part means this is the divide part of the
        // array
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    // and this will be the conquer part of the array
    static int[] merge(int[] left, int right[]) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array in not finshed
        // means the size of the left or right side are exceeding the length
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;

        }
        return mix;
    }
}
