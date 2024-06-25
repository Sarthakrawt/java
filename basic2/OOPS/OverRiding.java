package sortingAlgo.OOPs;

public class OverRiding {
    int num = 10;

    // this is second type of polymorphism function overriding
    @Override
    public String toString() {
        return "OjbectPrint{" +
                "num=" + num
                + '}';
    }

    public static void main(String[] args) {
        Overriding02 obj = new Overriding02();
        // obj.area();
        System.out.println(obj);
    }

}
