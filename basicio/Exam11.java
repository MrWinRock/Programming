import java.util.*;

public class Exam11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String product = input.next();
        double price = input.nextDouble();
        price *= 2;

        System.out.println(price);

        input.close();
    }
}