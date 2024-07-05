package arrays;

import java.util.Arrays;

// in java arrays are not contiguously stored in memory 
// as we know when we make a new variable it store in the stack
// where the value save in heap memory and the reference variable pointed 
// to that object/ value 
public class arr {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 4, 5 };
        change(arr);
        System.out.println(Arrays.toString(arr));
        // toString method convert array into string
    }

    // check this case
    // arry will modified because the referance is given to the function not  the copy of the array 
    static void change(int[] arr) {
        arr[0] = 99; // if you make a change to the object via this ref variable same object will be
                     // changed
    }
}
