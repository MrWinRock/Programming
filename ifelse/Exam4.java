// 4
import java.util.*;

public class Exam4 {
    static String total;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;
        int score1, score2;

        name1 = input.next();
        score1 = input.nextInt();
        name2 = input.next();
        score2 = input.nextInt();

        if(score1 > score2) {
            total = name1;
        }
        else if (score1 < score2) {
            total = name2;
        }
        else {
            total = name1 + " = " + name2;
        }
        
        System.out.println("---------------");
        System.out.println(total);


        input.close();
    }
}