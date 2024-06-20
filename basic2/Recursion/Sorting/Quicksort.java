
import java.util.Arrays;
//in quick sort you have to compare if the start elem is less then pivot then 
//it will go to the left side of the array 
// and end element is greated then the pivot then it will go right side of the array
// mean all the smaller element goes on left side of pivot and all the larger elem goes right side 
// of the pivot
public class Quicksort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 23, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, hi);
    }

}
