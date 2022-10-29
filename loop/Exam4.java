import java.util.*;

class Exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = input.next();
        String item;
        int price;
        int sum = 0;
        
        for(int i = 0; i < 12; i++) {
            System.out.print("Item: ");
            item = input.next();
            System.out.print("Price: ");
            price = input.nextInt();
            sum += price;
        }
        
        System.out.println("\n------------");
        System.out.println(sum);
        
        input.close();
    }
}