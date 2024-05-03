import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        // scanner is a class which is specifying the input string
        Scanner sc = new Scanner(System.in);
        // system.in your keyboard mean
        // you are taking a value form your keyboard
        // scanner class have nextInt() function which is used to take input as an
        // integer
        int a = sc.nextInt();
        System.out.println(a);
        // String
        String b = sc.next();
        System.out.println(b);
        // full para
        String c = sc.nextLine();
        System.out.println(c);
        // float
        float marks = sc.nextFloat();
        System.out.println(marks);
        // double
        double marks1 = sc.nextDouble();
        System.out.println(marks1);
        // char
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        // boolean
        boolean boo = sc.nextBoolean();
        System.out.println(boo);
    }
}
