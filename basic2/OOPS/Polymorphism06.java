package sortingAlgo.OOPs;

public class Polymorphism {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.sum(1, 2);
        obj.sum(1, 2, 3);
        // this is function overloading
        // or this is compile time polymorphism
    }
}
