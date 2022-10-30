import java.util.*;

public class Exam12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double feet = input.nextDouble();
        double inches = input.nextDouble();

        double toinch = feet * 12; // feet to inches
        double inchsum = inches + toinch; // inch from feet + inch from input

        double meter = inchsum / 39.37; // inches to meters
        
        System.out.println(meter);

        input.close();
    }
}