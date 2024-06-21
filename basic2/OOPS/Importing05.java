package sortingAlgo.OOPs;

class Hello {
    int age;

    static void print() {
        System.out.println("hello......");
        // if the static function is in the other call and you want to call it into the
        // main class you have to just use the class name
        // like this Hello.print();
        // this will call the static method form another class in main class

    }

    static void message() {
        // System.out.println(this.age); you cannot use this keyword inside a static
        // method
    }
}

public class Importing05 {
    public static void main(String[] args) {
        // you can directly use the class of another code inside same folder

        // static function call only static funciton without static keyword you don't
        // call it directily

        // for non static funciton you have to make a object every time
        Human h2 = new Human();
        h2.name = "sam";
        h2.salary = 120000;
        System.out.println(h2.name);
        Importing05 i = new Importing05();
        i.greeting();
        Hello.print();
    }

    void greeting() {
        System.out.println("hello!");
    }
}
