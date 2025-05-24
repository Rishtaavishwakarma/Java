
import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. IF Statement
        if (num > 0) {
            System.out.println("1. IF: Number is positive.");
        }

        // 2. IF-ELSE Statement
        if (num % 2 == 0) {
            System.out.println("2. IF-ELSE: Number is even.");
        } else {
            System.out.println("2. IF-ELSE: Number is odd.");
        }

        // 3. IF-ELSE IF Ladder
        if (num > 0) {
            System.out.println("3. IF-ELSE IF: Number is positive.");
        } else if (num < 0) {
            System.out.println("3. IF-ELSE IF: Number is negative.");
        } else {
            System.out.println("3. IF-ELSE IF: Number is zero.");
        }

        // 4. NESTED IF
        if (num >= 0) {
            if (num % 5 == 0) {
                System.out.println("4. NESTED IF: Number is non-negative and divisible by 5.");
            } else {
                System.out.println("4. NESTED IF: Number is non-negative but not divisible by 5.");
            }
        }

        // 5. SWITCH CASE
        System.out.print("Enter a day number (1 to 3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("5. SWITCH: Monday");
                break;
            case 2:
                System.out.println("5. SWITCH: Tuesday");
                break;
            case 3:
                System.out.println("5. SWITCH: Wednesday");
                break;
            default:
                System.out.println("5. SWITCH: Invalid day number.");
        }

        sc.close();
    }
}
