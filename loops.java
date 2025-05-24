
public class loops {

    public static void main(String[] args) {

        // 1. FOR Loop with CONTINUE
        System.out.println("1. FOR Loop (with continue):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("  Skipping i = " + i);
                continue; // Skips the rest of the loop when i == 3
            }
            System.out.println("  i = " + i);
        }

        // 2. WHILE Loop with BREAK
        System.out.println("\n2. WHILE Loop (with break):");
        int j = 1;
        while (j <= 5) {
            if (j == 4) {
                System.out.println("  Breaking at j = " + j);
                break; // Exits the loop when j == 4
            }
            System.out.println("  j = " + j);
            j++;
        }

        // 3. DO-WHILE Loop (unchanged for demonstration)
        System.out.println("\n3. DO-WHILE Loop:");
        int k = 1;
        do {
            System.out.println("  k = " + k);
            k++;
        } while (k <= 5);

        // 4. ENHANCED FOR Loop with CONTINUE
        System.out.println("\n4. ENHANCED FOR Loop (with continue):");
        int[] numbers = {10, 20, 30, 40, 50};
        int result = 0;
        for (int num : numbers) {
            if (num == 30) {
                System.out.println("  Skipping num = " + num);
                continue; // Skips adding 30
            }
            result += num;
            System.out.println("  num = " + num);
        }
        System.out.println("  result = " + result);

        // 5. NESTED Loop (FOR inside FOR with BREAK)
        System.out.println("\n5. NESTED FOR Loop (Multiplication Table 1-3, break on product > 4):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                int product = row * col;
                if (product > 4) {
                    System.out.print("break\t");
                    break; // Breaks the inner loop if product > 4
                }
                System.out.print(product + "\t");
            }
            System.out.println(); // Move to next row
        }
    }
}
