// 1
import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = input.next();
        String name = input.next();
        int quantity = input.nextInt();
        int price = input.nextInt();

        if (quantity < 5) {
            System.out.println("----------");
            System.out.println(id +"\n"+ name +"\n"+ quantity);
        }

        input.close();
    }
}