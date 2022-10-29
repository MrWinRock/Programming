import java.util.*;

class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] id = new String[3];
        String[] name = new String[3];
        int[] score = new int[3];
        String[] grade = new String[3];

        for(int i = 0; i < 3; i++) {
            System.out.print("ID: ");
            id[i] = input.next();
            System.out.print("Name: ");
            name[i] = input.next();
            System.out.print("Score: ");
            score[i] = input.nextInt();
            
            if (score[i] >= 80) {
                grade[i] = "A";
            }
            else if (score[i] >= 70) {
                grade[i] = "B";
            }
            else if (score[i] >= 60) {
                grade[i] = "C";
            }
            else if (score[i] >= 50) {
                grade[i] = "D";
            }
            else {
                grade[i] = "F";
            }
        }

        System.out.println("\n-----------");
        
        for(int i = 0; i < 3; i++) {
            System.out.println(name[i] +" "+ score[i] +" "+ grade[i]);
        }
        
        input.close();
    }
}