import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while loop.
        // int count = 0;
        // while (count < 1) {
        // System.out.println("HW");
        // count++;

        // }
        /*
         * int i = 1;
         * while (i <= 10) {
         * System.out.println(i + "\n");
         * i++;
         * }
         */
        // int i = 1;
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // System.out.println("\n");
        // while (i < n + 1) {
        // System.out.println(i + "\n");
        // i++;

        // }
        /*
         * int sum = 0;
         * while (i <= n) {
         * sum = sum + i;
         * i++;
         * 
         * }
         * System.out.println(sum);
         * 
         * }
         */
        // for loops
        // for (int j = 1; j < 4 + 1; j++) {
        // // (intialisation;condition;updation)
        // System.out.println("****");

        // }
        // reverse of a number.
        /*
         * int m = 0;
         * while (n > 0) {
         * int lastdigit = n % 10;
         * m = (m * 10) + lastdigit;
         * n = n / 10;
         * 
         * }
         * System.out.println(m);
         */
        // Stop at multiple of 10

        /*
         * do {
         * int j = sc.nextInt();
         * if (j % 10 == 0) {
         * break;
         * }
         * System.out.println(j);
         * 
         * } while (true);
         */

        // Factorial.
        /*
         * int n = sc.nextInt();
         * 
         * int fact = 1;
         * for (int i = 1; i <= n; i++) {
         * fact *= i;
         * 
         * }
         * System.out.println(fact);
         */
        // Multiplication table
        /*
         * int n = sc.nextInt();
         * for (int j = 1; j <= 10; j++) {
         * 
         * System.out.println(n + "*" + j + "=" + n * j);
         * 
         * }
         */
        // prime number detection.
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }

        // Patterns solving.
        //

    }
}