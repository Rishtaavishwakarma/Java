
public class cwh_03_Methods {
//01 Write a Java method to print the multiplication table of a number n.

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
//02  Write a program using functions to print the following pattern:
//     *
//     ** center hai bro
//    ***
//   ****

    static void Center_star(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// Write a recursive function to calculate the sum of first n natural numbers.

    public static int sum(int n) {

        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }

    }
// Write a function to print the following pattern:
//     ****
//     ***
//     **
//     *

    public static void Reverse_Star(int n) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
// Write a function to print the nth term of the Factorial series using recursion.

    static int fact(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    // Write a function to print the nth term of the Fibonacci series using recursion.
    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // Write a function to find the average of a set of numbers passed as arguments.
    static int Avg(int... args) {
        int avg = 0;
        for (int num : args) {
            avg += num;
        }
        return avg / args.length;
    }

    // Repeat problem 4 using Recursion.
    public static void Restar(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.err.println(" ");
        Restar(n - 1);
    }

    // Write a function to convert Celsius temperature into Fahrenheit.
    static double fahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static int add(int... args) {
        int result = 0;
        System.out.println(args.getClass().getComponentType().getSimpleName());
        for (int i : args) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        // table(5);
        // Center_star(5);
        // int add = sum(78);
        // System.out.println(add);
        // int Fibonacci = fibo(6);
        // System.out.println(Fibonacci);
        // int average = Avg(10, 20, 30);
        // System.out.println(average);
        // Restar(5);
        // System.out.println("" + fahrenheit(35));
        System.out.println(add(1, 2, 3, 4));
    }
}
