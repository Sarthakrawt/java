public class String02 {
    public static void main(String[] args) {
        String name = "sart";
        String name1 = "sart";
        // this == operator check where both are same datatype or not and give the
        // output in boolean
        System.out.println(name == name1);
        // it will give you flase
        // so how to make a value which is same but give me true or are different
        // objects
        String n = new String("kunal");
        String x = new String("kunal");
        System.out.println(n == x);

        // charAt function in String
        System.out.println(x.charAt(0));// you will get the character at the particular index
    }
}