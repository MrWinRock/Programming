import java.util.*;

public class Exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int price = input.nextInt();
        int quantity = input.nextInt();

        int sum = price * quantity;
        double dis = sum * 5/100;
        double total = sum - dis;

        System.out.println(sum + " " + total);

        input.close();
    }
}
