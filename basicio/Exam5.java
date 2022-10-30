import java.util.*;

// public class Exam5 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         double num1 = input.nextDouble();
//         double num2 = input.nextDouble();
//         double num3 = input.nextDouble();
//         double num4 = input.nextDouble();

//         double sum = num1 + num2 + num3 + num4;
//         double total = sum / 4;
        
//         System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4);
//         System.out.println(sum + " " + total);

//         input.close();
//     }
// }

public class Exam5 {

    public static double num;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int count = 1;

        while (count <= 4) {
            num = input.nextDouble();
            num += i;
            System.out.println(num);
            count++;
        }
        
        double sum = num / 4;

        System.out.println(num + " " + sum);

        input.close();
    }
}