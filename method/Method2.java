public class Method2 {
    // 4
    static double AddRealNumber(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }
    // 5
    static double DivideByInt(double n1, int n2) {
        return n1/n2;
    }
    // 6 ????
    static String FullName(String name, String sur) {
        return "Pharthiwath" + " Gristsoopharruth"; 
    }

    public static void main(String[] args) {
        System.out.println(AddRealNumber(1, 2, 3));
        System.out.println(DivideByInt(20.0, 5));
        System.out.println(FullName("name", "surname"));
    }
}
