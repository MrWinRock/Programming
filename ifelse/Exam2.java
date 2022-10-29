// 2
import java.util.*;

public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = input.next();
        String name = input.next();
        int score = input.nextInt();

        if (score > 70) {
            System.out.println("-----------");
            System.out.println(name +"\n"+ score);
        }

        input.close();
    }
}
