// 7
import java.util.*;

public class Exam7 {
    static int score;
    static String grade;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        score = input.nextInt();
        
        if (score > 85) {
            grade = "A";
        }
        else if (score > 81) {
            grade = "A-";
        }
        else if (score > 77) {
            grade = "B+";
        }
        else if (score > 73) {
            grade = "B";
        }
        else if (score > 69) {
            grade = "B-";
        }
        else if (score > 65) {
            grade = "C+";
        }
        else if (score > 61) {
            grade = "C";
        }
        else if(score > 57) {
            grade = "C-";
        }
        else if (score > 54) {
            grade = "D+";
        }
        else if (score > 49) {
            grade = "D";
        }
        else if (score > 45) {
            grade = "D-";
        }
        else {
            grade = "F";
        }

        System.out.println("----------");
        System.out.println(name + ": " + grade);

        input.close();
    }
}
