import java.util.*;

public class Exam6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            int total = num * i;
            System.out.println(num + "*"+ i + "=" + total);
        }

        input.close();
    }
}
