public class String04 {
    public static void main(String[] args) {
        float a = 453.1245f;

        // System.out.printf("formatted number is %.2f", a);
        // when you what to print the value inside the string format you use printf and
        // used percentage inside a format
        // this is also called place holder

        // %s - This placeholder can be replaced by any string, or any variable which
        // can be converted to a string.

        // %d - This placeholder can be replaced by any integer data type, including
        // int, short, byte, or long.

        // %f - This placeholder can be replaced by any floating-point data type,
        // including double and float.

        System.out.printf("Pie: %.3f", Math.PI);
        System.out.printf("hello %s", "world");
    }
}
