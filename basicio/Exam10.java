import java.util.*; 

public class Exam10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String surname = input.next();
        int score = 0;
        int count = 1;

        while (count <= 5) {
            int i = input.nextInt();
            score += i;
            count++;
        }

        System.out.println(name + " " + surname + " " + score);

        input.close();
    }
}