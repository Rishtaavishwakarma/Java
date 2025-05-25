
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
// Write a function to print the nth term of the Fibonacci series using recursion.

    static int fact(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        // table(5);
        // Center_star(5);
        // int add = sum(78);
        // System.out.println(add);
    }
}
