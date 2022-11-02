public class patterns {
    public static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void star1(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void halfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();

        }

    }

    public static void charchterpattern(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // Star pattern
        star(4);
        System.out.println();

        // Inverted star
        star1(5);
        System.out.println();
        // Half pyramid
        halfpyramid(4);
        System.out.println();
        // charchater
        charchterpattern(4, 'f');

    }
}
