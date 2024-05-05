import java.util.Scanner;

public class Func {

    // this is a function for sum of two variables where
    // its return type is void mean it is not returning anything
    // if your return type is int or string then you have to return that
    // value
    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // main is the main funciton which will run first
    public static void main(String[] args) {
        // function is a block of code
        // take a two number and print the sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        // function call
        sum(a, b);

        // calling greet function
        String str = greet("hello world!");
        // greet('hello world!'); is an argument
        System.out.println(str);
    }

    // String s is parameter
    static String greet(String s) {
        return s;
    }
}
