// 6
import java.util.*;

public class Exam6 {
    static double result;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int money = input.nextInt();

        if (money > 4000000 ) {
            result = money * 35/100;
        }
        else if (money > 2000000) {
            result = money * 30/100;
        }
        else if (money > 1000000) {
            result = money * 25/100;
        }
        else if (money > 750000) {
            result = money * 20/100;
        }
        else if (money > 500000) {
            result = money * 15/100;
        }
        else if (money  > 150000) {
            result = money * 5/100;
        }
        else {
            result = 0;
        }

        System.out.println("----------");
        System.out.println(result);

        input.close();
    }
}