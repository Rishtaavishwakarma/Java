
import java.io.*;

public class cwh_14_try {

    // Method demonstrating 'throws'
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {

        // 1. try-catch block
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("❌ Arithmetic Error: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException

        } catch (NullPointerException e) {
            System.out.println("❌ Null Pointer Exception!");
        } catch (Exception e) {
            System.out.println("❌ Some general exception occurred.");
        }

        // 3. try-catch-finally
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array index out of range.");
        } finally {
            System.out.println("✅ Cleanup done in finally block.");
        }

        // 4. throw keyword
        try {
            int age = 15;
            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote!");
            }
            System.out.println("You can vote!");

        } catch (ArithmeticException e) {
            System.out.println("❌ Custom Exception: " + e.getMessage());
        }

        // 5. throws keyword
        try {
            readFile("non_existing_file.txt");
        } catch (IOException e) {
            System.out.println("❌ File not found: " + e.getMessage());
        }

    }
}
