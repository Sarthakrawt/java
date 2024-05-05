public class basics5 {
    public static void main(String[] args) {
        // control flow
        int age = 12;
        if (age < 18) {
            System.out.println("it mean you are not eligible to vote");
        } else {
            System.out.println("you are eligible to vote");
        }
        // loops
        // while loop
        // first you have to initialize the variable
        int i = 0;
        // then in while a condition
        while (i != 3) {
            System.out.println(i);// statements
            i++;
            // task/operation
        }
        // for(initialize ; condition ; operation)
        // then statements

        for (int j = 0; j != 3; j++) {
            System.out.println(j);
        }

        do {
            System.out.println(i);// statements
            i++;// operations
        } while (i != 6);// conditions
    }
}
