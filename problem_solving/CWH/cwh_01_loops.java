
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

    // Write a program to find the factorial of a given number using for loops.
    public static void Fact_for() {
        int n = 10;
        int result = 1;
        for (int i = n; i >= 1; i--) {
            if (n == 0) {
                System.out.print("it's zero");
            } else {
                result *= i;
            }
        }
        System.out.println("Factorial = " + result);
    }

    // Repeat problem 5 using a while loop.
    public static void Fact_while() {
        int n = 10;
        int i = n;
        int result = 1;
        while (i >= 1) {
            if (n == 0) {
                System.out.print("it's zero");
            } else {
                result *= i;
            }
            i--;
        }
        System.out.println("Factorial = " + result);
    }

    // Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
    public static void Sum_mul() {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = ", n, i);
            sum += n * i;
            System.out.println(n * i);
        }
        System.out.println("Sum of Table " + sum);
    }

    // Write a program to sum first n even numbers using a while loop.
    public static void SumOfEven_While() {
        int n = 10;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += i;

            }
        }
        System.err.println("Sum of even Number = " + result);
    }

    public static void main(String[] args) {
        // Star();
        // SumOfEven();
        // Table();
        // Reverse_Table();
        // Fact_for();
        // Fact_while();
        // Sum_mul();
        SumOfEven_While();
    }
}
