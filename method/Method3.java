// 7
public class Method3 {
    static int Count(int[][] num1, int num2) {
        int count = 0;
        for(int i = 0; i < num1.length; i++) {
            for(int j = 0; j < num1.length; j++) {
                if(num1[i][j] == num2) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[][] num = 
        {
            {1, 2, 3},
            {2, 3 ,4},
            {3, 4, 5}
        };
        int result = Count(num, 3);
        System.out.println(result);
    }
}
