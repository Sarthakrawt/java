public class scoping7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;

        // out side a block you can access iside the block
        // {
        // this block element cal calls is parent values
        // but if you initialize inside the block then you cannot print it outside }
    }

    static void random() {
        // a = 10 ; you cannot access the value inside the function not outside it
    }
}
