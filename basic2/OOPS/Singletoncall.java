package sortingAlgo.OOPs;

public class Singletoncall {
    public static void main(String[] args) {
        // Singleton obj = new Singleton();
        // it will give you an error because the constructor is private
        Singleton ojb = Singleton.getInstance();
        // you can call make the function using the
        Singleton obj2 = Singleton.getInstance();
        obj2.age = 12;
        ojb.age = 14;
        System.out.println(obj2.age + " " + ojb.age);
        // both are pointing towards the same object

    }
}
