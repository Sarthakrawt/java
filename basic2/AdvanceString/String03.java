import java.util.Arrays;

public class String03 {
    public static void main(String[] args) {

        // out is a refrence variable of type printStream
        // println is a method in printStream class
        // developer made this method to ease print output

        // let's look at how prinln method print different type of datatype
        // inside println it will giving the string only in output
        System.out.println(12);
        System.out.println("hello");
        System.out.println('c');
        System.out.println(12.343f);
        System.out.println(new int[] { 2, 3, 3, 4 });// it will give me random value
        // it just return a string representation which is the compination of random
        // value , @ and some hashcode
        // so print the array
        System.out.println(Arrays.toString(new int[] { 2, 3, 3, 4 }));
        // which is a string

        String name = null;
        System.out.println(name);
        // give me null

        Integer num = new Integer(54);
        System.out.println(num.toString());
        // it will give me 54 as we know
        // Integer is a wrapper class
        // we know that integer are primitive so primitive does not have class or object
        // to use and they are store in stack meomory
    }
}
