
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Integer Input
        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();
        System.out.println("Integer entered: " + intVal);

        // 2. Float Input
        System.out.print("Enter a float: ");
        float floatVal = sc.nextFloat();
        System.out.println("Float entered: " + floatVal);

        // 3. Double Input
        System.out.print("Enter a double: ");
        double doubleVal = sc.nextDouble();
        System.out.println("Double entered: " + doubleVal);

        // 4. Long Input
        System.out.print("Enter a long: ");
        long longVal = sc.nextLong();
        System.out.println("Long entered: " + longVal);

        // 5. Short Input
        System.out.print("Enter a short: ");
        short shortVal = sc.nextShort();
        System.out.println("Short entered: " + shortVal);

        // 6. Byte Input
        System.out.print("Enter a byte: ");
        byte byteVal = sc.nextByte();
        System.out.println("Byte entered: " + byteVal);

        // 7. Boolean Input
        System.out.print("Enter true/false: ");
        boolean boolVal = sc.nextBoolean();
        System.out.println("Boolean entered: " + boolVal);

        // 8. Character Input
        System.out.print("Enter a character: ");
        char charVal = sc.next().charAt(0); // Reads 1st character from string input
        System.out.println("Character entered: " + charVal);

        // 9. String Input (Single Word)
        System.out.print("Enter a word: ");
        String word = sc.next(); // Reads until space
        System.out.println("Word entered: " + word);

        sc.nextLine(); // Clear the buffer

        // 10. String Input (Full Line)
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine(); // Reads the entire line
        System.out.println("Full sentence entered: " + line);

        // 11. Formatted Output
        System.out.printf("\nFormatted Output:\nInt: %d | Float: %.2f | Char: %c | Word: %s\n", intVal, floatVal, charVal, word);

        sc.close(); // Close scanner
    }
}
