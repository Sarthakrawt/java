package sortingAlgo.OOPs;

public class Overriding02 extends Overriding01 {
    @Override
    // this will run when the Overriding02 obj created
    // hence it is overriding the parent method
    void area() {
        System.out.println("this will overide");
    }
}
