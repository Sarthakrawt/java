public class shiftOperator {
    public static void main(String[] args) {
        // left shift operator (<<)
        // it will shift toward the left
        // ex 1010<<1= 10100
        // formula for left shift is
        // a<<b = a mulitply by 2 power b

        // Right Shift operator(>>)
        // it will move towards the right
        // ex 0011001 >> 1 => 001100
        // formula for right shift
        // a >> b
        // a/ 2 powr b
        System.out.println(2 << 1);
        // give you 4 as we know that 2 = 10 in binary and if we left shift this we will
        // get 100 in binary which is 4
        System.out.println(1 >> 1);
        // as we know in binary 1 = 1 and if we right shift 1 then we will get 0
    }
}
