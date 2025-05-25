
public class cwh_01_loops {

    public static void Star() {
        //Q1) Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

// Write a program to sum first n even numbers using a while loop.
    public static void SumOfEven() {
        int n = 10;
        int i = 0;
        int result = 0;
        while (i < n) {
            if (i % 2 == 0) {
                result += i;

            }
            i++;
        }
        System.err.println("Sum of even Number = " + result);
    }
// Write a program to print the multiplication table of a given number n.

    public static void Table() {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = ", n, i);
            System.out.println(n * i);
        }
    }

    // }Write a program to print a multiplication table of 10 in reverse order.
    public static void Reverse_Table() {
        int n = 5;
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d X %d = ", n, i);
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        // Star();
        // SumOfEven();
        // Table();
        Reverse_Table();
    }
}
