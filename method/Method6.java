import java.util.*;

public class Method6 {
    // 10
    static double FindMaxMember(double[] n) {
        double MaxNum = n[0];
        for(int i = 0; i < n.length; i++) {
            if(n[i] > MaxNum) {
                MaxNum = n[i];
            }
        }

        return MaxNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Size: ");
        int a = input.nextInt();
        double[] array = new double[a];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            array[i] = input.nextDouble();
        }

        double result = FindMaxMember(array);
        System.out.println("Max Number: " + result);

        input.close();
    }
}
