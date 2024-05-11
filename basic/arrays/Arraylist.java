import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        // Arraylist is part of collection framework
        // arraylist have no limitation in size
        ArrayList<Integer> arrlist = new ArrayList<>();// in () you can intialize capacity
        // add is used to add the elements in arraylist
        Scanner sc = new Scanner(System.in);

        // arrlist.add(10);
        // arrlist.add(12);
        // arrlist.add(13);
        // arrlist.add(1);
        // arrlist.add(3);
        // arrlist.add(4);
        // arrlist.add(5);
        // // to remove item from arraylist
        // arrlist.remove(2);// pass index
        // // update the existing item

        // arrlist.set(1, 23); // index , element
        // System.out.println(arrlist.size());
        // System.out.println(arrlist);

        // for input
        for (int i = 0; i < 5; i++) {
            arrlist.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arrlist.get(i));// it will give you each element at i index
        }
        System.out.println(arrlist);

        // internally arrlist is reference and
    }
}
