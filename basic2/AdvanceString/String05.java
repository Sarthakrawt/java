import java.util.ArrayList;

public class String05 {
    // concatination
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        // it will give me the sum of the of both a and b ascii value

        // let check for string
        // it will just concat these two value
        // ab is the output
        System.out.println("a" + "b");

        System.out.println('a' + 1);
        // it will give me the next value which is b if i convert it into character 

        System.out.println("a" + 1);
        // it will show me a1 ie concat both the value
        // where integer converted into Integer and it will call toString() method
        System.out.println("a" + 1 + 2);
        // it will also give me a12

        System.out.println(1 + 3 + "a");
        // this give me 4a because it will add first then add a to it

        System.out.println("a" + new ArrayList<>());
        // same for this
        System.out.println("a" + new Integer(45));
        System.out.println(new Integer(57) + " " + new ArrayList<>());

        // it will give you error
        // because one of the object should be string then it will work
        // - operator will not work in this case becuase it will work only for primitive

        // note :: this values which we are printing are not stored in memory so when
        // they are used and use of this is over then grabage collecter will delete it
        // automatically

    }
}
