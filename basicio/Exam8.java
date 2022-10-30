import java.util.*;

public class Exam8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        
        id = input.nextInt();
        String name = input.next();
        double score = input.nextDouble();

        System.out.println(name + " " + score);

        input.close();
    }
}
