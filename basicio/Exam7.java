import java.util.*;

public class Exam7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        String name = input.next();
        int quantity = input.nextInt();
        double price = input.nextDouble();

        System.out.println(id + " " + name + " " + quantity + " " + price);

        input.close();
    }
}
