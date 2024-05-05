public class functionoverloading {
    public static void main(String[] args) {
        // which function should be run decided in compile time which should be run
        fun(45);
        fun(12, "sarthak");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, String b) {
        System.out.println(a + " " + b);
    }
}
