import java.util.*;

class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[5];
        int expo[] = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }

        for(int i = 0; i < 5; i++) {
            expo[i] = num[i] * num[i];
        }

        System.out.println("-----------");
        System.out.print(sum + " | ");

        for(int i = 0; i < 5; i++) {
            System.out.print(expo[i] + " ");
        }

        input.close();
    }
}