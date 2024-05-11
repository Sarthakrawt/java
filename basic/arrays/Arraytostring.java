import java.util.Arrays;

public class Arraytostring {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 4, 3 };
        String s = Arrays.toString(arr);
        // Arrays.toString() method returns a string of array

        System.out.println(s);
        int[][] a = {
                { 23, 3, 4, 54 },
                { 23, 32, 2 }
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        // optimized version of loop
        // inhance for loop
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }
    }

}
