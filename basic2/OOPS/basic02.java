package sortingAlgo.OOPs;

class Student {
    int age;
    String name;
}

public class basic02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 12;
        s1.name = "sam";
        Student s2 = s1;
        System.out.println(s2.name);
        // s2 is just poiting to the same objects in s1 so if you change the object then
        // it will also change inside the s2 referance value
        // and all the classes write in Large letter
        Integer num = 32;
        // integer is a class and you can use it method and properties

        // final keyword is keyword which will not allow you to modify after it
        // insiallized
        final int a = 12;

        // a = 23;// it will give you the errror

        // final is only worked on primitive data type
        // ex=
        final Student s3 = new Student();
        s3.name = "sarthak";
        s3.age = 12;
        // garbage collector when the code is not used the garbage collector will remove
        // it automaticly
    }
}
