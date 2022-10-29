import java.util.*;

public class Exam {
    static int[] FillArray(Scanner input, int[] n) {
        
        for(int i = 0; i < n.length; i++) {
            System.out.print("Number " + (i+1) +": ");
            n[i] = input.nextInt();
        }
        return n;
    }

    static double AddRealNumber(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Size: "); 
        int a = input.nextInt();
        int[] num = new int[a];

        int[] array = FillArray(input, num);
        System.out.println(Arrays.toString(array));

        System.out.println(AddRealNumber(1, 2, 3));
        
        input.close();
    }
}
