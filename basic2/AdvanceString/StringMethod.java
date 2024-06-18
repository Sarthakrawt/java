import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "kunal kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        // it will converted into char array

        System.out.println(name.toUpperCase());
        // it will change the String to lowerCase

        System.out.println(name);
        // but these method will not affect the orignal String
        System.out.println(name.indexOf('a'));
        // it will give you the starting index

        System.out.println(name.lastIndexOf('a'));
        // it will give you the last index

        System.out.println("     kam cho   ".strip() + 1);
        // it will remove all the white spaces

        System.out.println(Arrays.toString(name.split(" ")));
        // it will split the array using space or it is also called regex
    }
}
