import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {

        // arrays are non primitive types
        // initialize array
        int[] arr = new int[4];
        // new is used to create an object
        int[] arr1 = { 1, 2, 3, 4 };
        arr[0] = 12;
        arr[1] = 3;
        String[] array = new String[4];
        System.out.println(array[0]);
        // internally arrrays are initialized
        // arr is reference and new int[5] object in heap memory
        // when we givin the array size it means that we are allocating memory in heap
        // memory
        // then one by one we are givig the value in that memory
        // where arr[0] are the reference and 12 is in the heap memory
        // means we are allocating memory in memory
        // arr[0] = 12;
        // arr[1] = 3;
        // arr[2] = 4;
        // arr[3] = 5;
        // arr[4] = 6;
        // heap memory not continous

        // ar[0] where 0 is an index and java support zero indexing

        // using scanner class you can input form the keyboard
        Scanner sc = new Scanner(System.in);
        // allocating memory
        int arr2[] = new int[11];
        for (int i = 0; i < arr2.length; i++) {
            // get the value in every index
            arr2[i] = sc.nextInt();
        }
        for (int a : arr) {
            System.out.println(a);
        }

        // array of objects
        String[] arrays = new String[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.next();
            System.out.println(arrays[i]);
        }
        // arrays are mutable
        // means you can change the value

    }
}
