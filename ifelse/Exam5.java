// 5
// import java.util.*;

// public class Exam5 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int numbers[] = new int[3]; // 0, 1, 2

//         for(int i = 0; i < numbers.length; i++) {
//             numbers[i] = input.nextInt();
//         }

//         for(int i = 0; i < numbers.length; i++){
//             for(int j = i + 1; j < numbers.length; j++) {
//                 if(numbers[i] > numbers[j]) {
//                     int temp = numbers[i];
//                     numbers[i] = numbers[j];
//                     numbers[j] = temp;
//                 }
//             }
//         }

//         System.out.println("----------");

//         for(int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }

//         input.close();
//     }
// }

/***************************************************************************/

import java.util.*;

public class Exam5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, temp;
		
		num1 = input.nextInt(); 
		num2 = input.nextInt(); 
		num3 = input.nextInt(); 
		
        if(num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if(num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        }
        if(num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if(num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        }

		
        System.out.println("-----------");
		System.out.println(num1 +" "+ num2 +" "+ num3);

        input.close();
	}
}