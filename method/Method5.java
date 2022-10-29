import java.util.*;

public class Method5 {
    // 9
    static String ReverseString(String str) {
        String restr = "";
        char temp;

        for(int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            restr = temp + restr;
        }
        return restr;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String string = input.nextLine();

        String result = ReverseString(string);

        System.out.print("Reversed String: ");
        System.out.println(result);

        input.close();
    }
}