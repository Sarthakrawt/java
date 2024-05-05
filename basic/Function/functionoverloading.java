// function overloading  when we make a function
//multiple times with same name but there paramenters are differnt
public class functionoverloading {
    public static void main(String[] args) {
        // which function should be run decided in compile time which should be run
        fun(45);
        fun(12, "sarthak");
    }
   // fun function with int a paramenter
    static void fun(int a) {
        System.out.println(a);
    }
   // fun function with a , b paramenter
    static void fun(int a, String b) {
        System.out.println(a + " " + b);
    }
}
