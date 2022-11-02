import java.util.Scanner;

public class statemnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If statement.
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not adult");

        } else if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Wrong");
        }
        // Calculator.
        System.out.println("Enter the your choice:");
        int ch = sc.nextInt();
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();

        switch (ch) {
            case 1: {
                int sum = a + b;
                System.out.print(sum);
                break;

            }
            case 2: {
                int diff = a - b;
                System.out.print(diff);
                break;
            }
            case 3: {
                int mul = a + b;
                System.out.print(mul);
                break;
            }
            case 4: {
                int div = a + b;
                System.out.print(div);
                break;
            }
            default: {
                System.out.println("Enter the correct choice");
            }

        }

    }
}
