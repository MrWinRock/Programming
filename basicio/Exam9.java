import java.util.*;

public class Exam9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.print(num1 + num2 + " ");
        System.out.print(num1 - num2 + " ");
        System.out.print(num1 * num2 + " ");
        System.out.print(num1 / num2 + " ");

        input.close();
    }   
}
