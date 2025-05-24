
public class loops {

    public static void main(String[] args) {

        // 1. FOR Loop
        System.out.println("1. FOR Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  i = " + i);
        }

        // 2. WHILE Loop
        System.out.println("\n2. WHILE Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("  j = " + j);
            j++;
        }

        // 3. DO-WHILE Loop
        System.out.println("\n3. DO-WHILE Loop:");
        int k = 1;
        do {
            System.out.println("  k = " + k);
            k++;
        } while (k <= 5);

        // 4. ENHANCED FOR Loop (for-each loop)
        System.out.println("\n4. ENHANCED FOR Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        int result = 0;
        for (int num : numbers) {
            result += num;
            System.out.println("  num = " + num);
        }
        System.out.println("  result = " + result);

        // 5. NESTED Loop (FOR inside FOR)
        System.out.println("\n5. NESTED FOR Loop (Multiplication Table 1-3):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + "\t");
            }
        }
    }
}
