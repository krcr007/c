public class functions {
    public static void hello(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*\t");
        }
    }

    public static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println(multiply);

    }

    public static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }

    public static int bino(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);

        int C = a / (b * c);
        return C;
    }

    public static void prime(int n, int r) {
        boolean flag = true;
        for (int i = 2; i <= r; i++) {
            if (n % i == 0) {
                flag = false;
                break;

            }
            if (!flag) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(bino(5, 1));

    }

}
