// 3
import java.util.*;

public class Exam3 {
    public static double total;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextInt();
        double num2 = input.nextInt();
        String operator = input.next();
        
        switch (operator) {
            case "+" :
                total = num1 + num2;
                        break;
            case "-" :
                total = num1 - num2;
                        break;
            case "*" :
                total = num1 * num2;
                        break;
            case "/" :
                total = num1 / num2;
                        break;
            default : System.out.println("Not an Operator");
        }

        System.out.println(num1 + " + " + num2 + " = " + total);

        input.close();
    }
}
