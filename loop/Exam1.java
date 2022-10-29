import java.util.*;

class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id;
        String name;
        int quantity;
        double price;
        double sum = 0;

        for(int i = 0; i < 5; i++) {
            id = input.next();
            name = input.next();
            quantity = input.nextInt();
            price = input.nextDouble();
            sum += price;
        }

        System.out.println("------------");
        System.out.println(sum);

        input.close();
    }
}