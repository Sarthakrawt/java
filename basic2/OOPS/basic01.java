package sortingAlgo.OOPs;

import java.util.Arrays;

class demo {
    // class are the set of property and function
    // object is an instance of the class
    int rno;
    String name;
    float marks;

    // by default the value of this reference varaible are null and 0 for primitive
    // and non primitive
    demo() {
        // this is the consturctor
        // this keyword is used to automatically access the keyword which we assign
        // through the object
        // in simple meaning this keyword is an object 
        this.rno = 12;
        this.name = "raw";
        // it will fixid the value of name ot raw
    }

    demo(int rollno, String name) {
        this.rno = rollno;
        this.name = name;
    }
}

public class basic01 {
    public static void main(String[] args) {
        demo d1 = new demo();
        // demo() is a constructor
        // constructor is a special type of funciton in the class
        // this is by defeat function which we don't have to create

        // . you can acces the properties of class using object
        d1.marks = 12.4f;
        System.out.println(d1.marks);
        System.out.println(d1);// it will give you a random value

        System.out.println(d1.name);
        demo d2 = new demo(12, "kunal");
        System.out.println(d2.name);
    }
}
