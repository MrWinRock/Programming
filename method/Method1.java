class Method1 {
    // 1
    static void Intro() {
        System.out.println("65122250031 ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
    }
    // 2
    static double ShowPi() {
        return 22.0/7;
    }
    // 3
    static void Fac(int n) {
        int fac = 1;
        for(int i = 1; i <= n; i++) {
            fac *= i;
        }

        System.out.println(fac);
    }

    public static void main(String[] args) {
        Intro();
        System.out.println(ShowPi());
        Fac(3);
    }
}