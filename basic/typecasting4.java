import java.util.Scanner;

public class typecasting4 {
    public static void main(String[] args) {
        // type casting
        int num = (int) (12.34f);
        System.out.println(num);

        // it will automatically typecast
        int numb2 = 'A';
        System.out.println(numb2);

        System.out.println(23.4 * 234);// it will give you float

        // note that if the data type size is bigger than other data type then it will
        // automatically convert into that bigger size data type

        System.out.println(234.34 * 234234343);// float
    }
}
