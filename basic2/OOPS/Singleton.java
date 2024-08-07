package sortingAlgo.OOPs;

public class Singleton {
    int age;

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether one obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // public static void main(String[] args) {
    // Singleton obj1 = new Singleton();
    // it the counstructor is private then it will not be used that classs only it
    // cannot be used in other class
    // }

}
