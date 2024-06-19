package recursion;

public class recursion01 {
    public static void main(String[] args) {
        // in recursion we just  call the function agian and agian
        recursion(4);
        Numb(0);
    }

    static void recursion(int i) {
        // this is a base condition where are recusion stop making new calls
        if (i == 0) {
            return;
        }
        System.out.println("hello World");
        recursion(i - 1);
        // calling a function inside a function

        // while the function is not printing it basically mean it is on the stack
        // memory
        // let check one more example
    }

    static void Numb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        Numb(n + 1);
    }
    // let see how it work internally
    // first it will call numb(0) form main function
    // it will push it into the stack
    // second it will print 0 and call numb(1)
    // the numb(1) will print 1 call numb(2) and go to the stack and vice versa 
    // then numb(3) go in stack call numb(4)
    // numb(4) go into stack and call numb(5)
    // numb(5) go into stact and print 5 call numb(6)
    // numb(6) it will check the control statment the all the function will pop one by one
    // numb(6) will pop
    // then numb(5) , numb(4) soon
    // will pop form the stack

}
