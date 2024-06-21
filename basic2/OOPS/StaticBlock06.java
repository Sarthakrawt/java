package sortingAlgo.OOPs;

public class StaticBlock06 {
    static int a = 3;
    static int b;
    static {
        System.out.println("this is a static block ");
        b = a * 5;
    }

    public static void main(String[] args) {
        // as we can see that when we make a first object it calls the static block
        StaticBlock06 obj1 = new StaticBlock06();
        System.out.println(StaticBlock06.a + " " + StaticBlock06.b);
        StaticBlock06.b += 4;
        System.out.println(StaticBlock06.a + " " + StaticBlock06.b);

        // when we call the other object then it did'nt call the static block
        StaticBlock06 obj2 = new StaticBlock06();
        System.out.println(StaticBlock06.a + " " + StaticBlock06.b);
    }
}
