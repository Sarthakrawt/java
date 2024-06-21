package sortingAlgo.OOPs;

// as we know we are using java.util or importing this in our code so many time so we can use the properties of the class 
class Human {
    int age;
    String name;
    int salary;
}
// also we can used the class properties without import it if both code are in the same folder 
public class Imports04 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age = 12;
        h1.name = "sarhtak";
        h1.salary = 120000;
    }
}
