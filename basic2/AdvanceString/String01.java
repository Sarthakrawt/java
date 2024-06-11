
public class String01 {
    public static void main(String[] args) {
        String name = "sarthak Singh";
        // wheare name is the reference had value or object sarthak Singh
        // let check how it stored in memory
        // if we write keyword starts with capital letter is a class
        // like String is a class

        // String a = "sarthak"
        // String b = "sarthak"
        // both the reference values are pointing towards the same object

        // String pool
        // String name = "kunal"
        // where is name is a reference value and point towwards the object kunal in
        // string pool or heap memory

        // Immutablitlity
        // you cannot change the string object beucase string are imutable in java
        String a = "kunal";
        String b = "kunal";
        // kunal will automatically deleted by grabage collector
        System.out.println(b);
        // b = "hello";
        // this will create a new object where b is pointed to the object hello
        System.out.println(b);

        // let's check that both value are equal if both the object in a an b are
        // pointed towards the kunal object

        System.out.println(a == b);// == for comparision it will give you true or flase
    }
}
