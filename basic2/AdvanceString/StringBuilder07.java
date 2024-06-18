public class StringBuilder07 {
    public static void main(String[] args) {

        // StringBuilder is a class it means it also contain some method
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        // it will not create new object agian and agian
        // it will just checking final object
        System.out.println(builder.toString());
    }
}
