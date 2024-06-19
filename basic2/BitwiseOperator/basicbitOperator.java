
public class BasicbitOperator {
    public static void main(String[] args) {
        // And bitwise Operator
        // a b a&b
        // ex 0 1 0
        // a*b
        int a = 4;
        int b = 6;
        System.out.println(a & b);

        // OR bitwise operator
        // a b aORb
        // ex 0 1 1
        // a+b
        System.out.println(a | b);

        // XOR bitwise operator
        // if the values are same then it will give you 0
        // a b a^b
        // 0 0 0
        // 1 1 0

        System.out.println(a ^ b);

    }
}
