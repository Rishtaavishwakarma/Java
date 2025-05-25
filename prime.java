
import java.util.Scanner;

public class prime {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            for (int i = 2; i <= j / 2; i++) {
                System.out.println(" ");
                if (j % i == 0) {
                    System.out.printf("Number %d is not prime", j);
                    break;
                } else {
                    System.out.printf("Number %d is prime", j);
                    break;
                }
            }
        }

    }
}
