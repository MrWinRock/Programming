import java.util.*;

class Exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, grade;
        int sum = 0;
        int[] score = new int[5];
        System.out.print("Name: ");
        name = input.nextLine();

        for(int i = 0; i < 5; i++) {
            System.out.print("Score: ");
            score[i] = input.nextInt();
            sum += score[i];
        }
        
        if (sum >= 80) {
            grade = "A";
        }
        else if (sum >= 70) {
            grade = "B";
        }
        else if (sum >= 60) {
            grade = "C";
        }
        else if (sum >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("\n-----------");
        System.out.println(name +" "+ grade);
        
        input.close();
    }
}