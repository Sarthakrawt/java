public class sadowing8 {
    static int a = 12;

    public static void main(String[] args) {
        System.out.println(a);// 12
        // this is called shadowing becuase it will declare before this so we just
        // overriding that variable
        int a = 220;
        System.out.println(a);// 220

    }
}
