
public class Methods {

    // 1. Basic Method
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2. Method with Parameters and Return Type
    public static int add(int a, int b) {
        return a + b;
    }

    // 3. Method Overloading (same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 4. Recursive Method (Factorial)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    // 5. Recursive Method (Fibonacci)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base case

                }return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
    }

    public static void main(String[] args) {

        // Call basic method
        System.out.println("1. Basic Method:");
        greet();

        // Call method with parameters
        System.out.println("\n2. Method with Parameters:");
        int sum = add(10, 20);
        System.out.println("  Sum = " + sum);

        // Call overloaded methods
        System.out.println("\n3. Method Overloading:");
        System.out.println("  multiply(int, int) = " + multiply(2, 3));
        System.out.println("  multiply(double, double) = " + multiply(2.5, 4.0));
        System.out.println("  multiply(int, int, int) = " + multiply(2, 3, 4));

        // Call recursive method - Factorial
        System.out.println("\n4. Recursive Method - Factorial:");
        int fact = factorial(5);
        System.out.println("  Factorial of 5 = " + fact);

        // Call recursive method - Fibonacci
        System.out.println("\n5. Recursive Method - Fibonacci:");
        for (int i = 0; i < 7; i++) {
            System.out.print("  " + fibonacci(i));
        }
        System.out.println();
    }
}
