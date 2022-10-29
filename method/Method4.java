import java.util.*;

public class Method4 {
    // 8
    static int[] FillArray(Scanner input, int[] n) {
        
        for(int i = 0; i < n.length; i++) {
            System.out.print("Number " + (i+1) +": ");
            n[i] = input.nextInt();
        }
        return n;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Size: "); 
        int a = input.nextInt();
        int[] num = new int[a];

        int[] array = FillArray(input, num);
        System.out.println(Arrays.toString(array));
        
        input.close();
    }
}
