import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // int[][] arr = new int[4][];
        // int[][] arr2 = {
        // { 1, 2, 3, 4 },
        // { 334, 43, 4, 5 },
        // { 34, 4, 5, 5 }
        // };
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  1 2");
            }
            System.out.println();
        }
        // internally at first we have empty arrays
        // starting from first loop
        // first loop we are taking row and we know the whole array is length of row
        // and in second loop we are taking column where we are checking each array row
        // length and then we taking the input in that array

    }
}
