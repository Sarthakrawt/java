public class swap6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;
        // when you pass a value on this swap function it will swap those numbers inside
        // the fuction
        swapp(a, b);
        // it will not swap
        System.out.println(a + " " + b);
    }

    static void swapp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // scope is one of the reason that it will not swap
    }
}
// let internally how is working
// you make value int a = 12
// so a is a reference variable and 12 is a value which is situated in heap
// memory and using reference a is pointing to that value
// same for function
// when we make a swap function
// we are giving a two parameters in that fuction
// and pass the reference copy as a argument and both are pointing to the same
// name = kunal
// change(name);
// change(name){
// name = Rahul;
// }
// in this example name inside the function create in a heap memory
// and it just pointing to that value so the kunal name is not changed
