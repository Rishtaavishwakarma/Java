
import java.util.Scanner;

public class prime {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.printf("Number %d is not prime", num);
                break;
            } else {
                System.out.printf("Number %d is prime", num);
                break;
            }
        }
    }
}
