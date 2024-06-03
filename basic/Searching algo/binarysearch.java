public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 56 };
        binarySearch(arr, 5);
    }

    static void binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                System.out.println(mid);
                return;
            }

        }
    }
}
